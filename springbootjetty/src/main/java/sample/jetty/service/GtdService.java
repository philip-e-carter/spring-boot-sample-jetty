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

package sample.jetty.service;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class GtdService {

	@Autowired
	TaskRepository taskRepository;

	public String test() {
		return taskRepository.findAll().iterator().next().getDescription();
	}
        
	@Value("${name:World 01}")
	private String name;

	public String getHelloMessage() {
		return "Hello " + this.name;
	}

	public Collection<Task> getTasks() {
		Collection<Task> tasks = taskRepository.findAll();
		System.out.println("Tasks found: " + tasks.size());
		return tasks;
	}

	public Task addTask(String taskId, String taskDescription, String taskContext, String taskStatus) {
		Task task = new Task();
        if (!StringUtils.isEmpty(taskId)) {
            task.setId(new Integer(taskId));
        }
		task.setDescription(taskDescription);
		task.setContext(taskContext);
		task.setStatus(taskStatus);
		Task updatedTask = taskRepository.save(task);
		printTaskCount();
		return updatedTask;
	}

	public void printTaskCount() {
		Collection<Task> tasks = taskRepository.findAll();
		System.out.println("Tasks found: " + tasks.size());
	}

}
