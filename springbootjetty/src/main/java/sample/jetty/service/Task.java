package sample.jetty.service;

public class Task {

	private String context;
	private String description;
	private Integer id;

	public Task(Integer id, String description, String context) {
		super();
		this.id = id;
		this.description = description;
		this.context = context;
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

	public void setContext(String context) {
		this.context = context;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
