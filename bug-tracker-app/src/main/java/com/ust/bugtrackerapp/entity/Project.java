package com.ust.bugtrackerapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	//@GeneratedValue
	private Long pjt_id;
	private String pjt_name;
	private String pjt_desc;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(Long pjt_id, String pjt_name, String pjt_desc) {
		super();
		this.pjt_id = pjt_id;
		this.pjt_name = pjt_name;
		this.pjt_desc = pjt_desc;
	}
	
	public Long getPjt_id() {
		return pjt_id;
	}
	public void setPjt_id(Long pjt_id) {
		this.pjt_id = pjt_id;
	}
	public String getPjt_name() {
		return pjt_name;
	}
	public void setPjt_name(String pjt_name) {
		this.pjt_name = pjt_name;
	}
	public String getPjt_desc() {
		return pjt_desc;
	}
	public void setPjt_desc(String pjt_desc) {
		this.pjt_desc = pjt_desc;
	}
	@Override
	public String toString() {
		return "Project [pjt_id=" + pjt_id + ", pjt_name=" + pjt_name + ", pjt_desc=" + pjt_desc + "]";
	}
	
	

}
