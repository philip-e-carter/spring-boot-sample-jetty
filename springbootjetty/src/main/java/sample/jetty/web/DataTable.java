package sample.jetty.web;

import java.util.Collection;

import sample.jetty.service.Task;

public class DataTable {

//	public Integer iTotalRecords;
//	public Integer iTotalDisplayRecords;
//	public String sColumns;
//	public String sEcho;
	public 	Collection<Task> data;
	public Collection<Task> getData() {
		return data;
	}
	public void setData(Collection<Task> data) {
		this.data = data;
	}
	
}
