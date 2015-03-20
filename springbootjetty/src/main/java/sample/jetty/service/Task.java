package sample.jetty.service;

import javax.persistence.Entity;

@Entity
public class Task {

	private Integer id;
	private String description;
	private String context;
	private String status; // e.g., Complete, in-progress.

	public Task(Integer id, String description, String context, String status) {
		super();
		this.context = context;
		this.description = description;
		this.id = id;
		this.status = status;
	}

	public String getContext() {
		return context;
	}
	public String getDescription() {
		return description;
	}

	public Integer getId() {
		return id;
	}
	public String getStatus() {
		return status;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
