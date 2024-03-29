/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.jetty.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import sample.jetty.service.GtdService;
import sample.jetty.service.Task;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * NOTE: if RequestMapping is the same as the returned html file, it causes a
 * "Circular view path" error. e.g.:
 * 
 * @RequestMapping("/index") public String index() { return "index.html"; } I
 *                           can only guess that Spring is first stripping the
 *                           .html from the response and checking for that
 *                           RequestMapping, causing the circle.
 * 
 */
@Controller
public class GtdController {

	@Autowired
	private GtdService gtdService;

	// Redirects to the main page.
	// http://localhost:8080/
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return this.gtdService.getHelloMessage();
	}

	// Displays the main page.
	// http://localhost:8080/html
	@RequestMapping("/html")
	public String html() {
		System.out.println(gtdService.test());
			return "index.html";
	}

	// When user clicks "Click Me" button, use ajax to replace content
	// "replaceMe"
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "Tasks here";
	}

	// Displays the jqgrid test page.
	// http://localhost:8080/jqgrid
	@RequestMapping("/jqgrid")
	public String jqgrid() {
		return "jqgridtest.html";
	}

	// Returns the json fragment to populate the jqgrid table.
	// http://localhost:8080/jqgridData
	@RequestMapping("/jqgridData")
	@ResponseBody
	public Collection<Task> jqgridData() {
		return gtdService.getTasks();
	}

	@RequestMapping(value="/addTask", method=RequestMethod.POST)
	@ResponseBody
	public Collection<Task> addTask(HttpServletRequest request) {
		Task task = gtdService.addTask(
                request.getParameter("taskId"),
                request.getParameter("taskDescription"),
                request.getParameter("taskContext"),
                request.getParameter("taskStatus")
        );
		gtdService.printTaskCount();
		return gtdService.getTasks();
	}

	@RequestMapping(value="/deleteTask", method=RequestMethod.POST)
	@ResponseBody
	public Collection<Task> deleteTask(HttpServletRequest request) {
		gtdService.deleteTask(request.getParameter("taskId"));
        return gtdService.getTasks();
	}

}
