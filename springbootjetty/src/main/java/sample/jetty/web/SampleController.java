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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sample.jetty.service.HelloWorldService;
import sample.jetty.service.Task;

@Controller
public class SampleController {

	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return this.helloWorldService.getHelloMessage();
	}

	@RequestMapping("/html")
	public String html() {
		return "index.html";
	}

	@RequestMapping("/test")
	public String test() {
		return "Tasks here";
	}

	@RequestMapping("/tasks")
	@ResponseBody
	public DataTable tasks() {
		DataTable d = new DataTable();
		d.setData(helloWorldService.getTasks());
		d.setiTotalDisplayRecords(1);
		d.setiTotalRecords(1);
		d.setsColumns("description");
		d.setsEcho("3");
		return d;
	}

}
