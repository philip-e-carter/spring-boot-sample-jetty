package sample.jetty.web;

import java.util.Collection;

import sample.jetty.service.Task;

public class DataTable {

	public Integer iTotalRecords;
	public Integer iTotalDisplayRecords;
	public String sColumns;
	public String getsColumns() {
		return sColumns;
	}
	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}
	public String sEcho;
	public 	Collection<Task> data;
	public Integer getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(Integer iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public Integer getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
	public String getsEcho() {
		return sEcho;
	}
	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}
	public Collection<Task> getData() {
		return data;
	}
	public void setData(Collection<Task> data) {
		this.data = data;
	}
	
	
	
}
