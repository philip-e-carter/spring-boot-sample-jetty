package sample.jetty.service;

public class Task {

	private String description;

	public Task(String description, String context, Integer priority) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}