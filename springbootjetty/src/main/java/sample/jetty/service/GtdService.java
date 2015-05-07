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
		final Collection<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task(1, "Buy bread", "Around Town", ""));
		tasks.add(new Task(2, "Buy milk", "Around Town", ""));
		tasks.add(new Task(3, "Buy sugar", "Around Town", ""));
		tasks.add(new Task(4, "Buy eggs", "Around Town", "X"));
		tasks.add(new Task(5, "Go to hardware store", "Around Town", "X"));
		tasks.add(new Task(6, "Finances", "Home computer", "X"));
		tasks.add(new Task(7, "Digitize", "Home computer", "I"));
		tasks.add(new Task(8, "Research technology", "Internet", "I"));
		tasks.add(new Task(9, "Call doctor", "Phone", "X"));
		tasks.add(new Task(10, "Call friends and family", "Phone", "X"));
		tasks.add(new Task(11, "Program GTD the Game", "Macbook", "X"));
		tasks.add(new Task(12, "Learn more about Unix", "Macbook", "X"));
		return tasks;
	}

}
