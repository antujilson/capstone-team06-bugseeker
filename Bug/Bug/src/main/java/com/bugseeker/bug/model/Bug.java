package com.bugseeker.bug.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bug {
	
	@Id
	private Double id;
	private String title;
	private String description;
	private String status;
	
	public Bug() {
		
	}

	public Bug(Double id, String title, String description, String status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bug [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + "]";
	}
	
	

}
