package com.ust.bugtrackerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bugtrackerapp.entity.Project;
import com.ust.bugtrackerapp.service.ProjectService;

@RestController
@RequestMapping("/bug")
public class ProjectController {
	@Autowired
	private ProjectService service;
	
	@PostMapping
	public Project addproject(@RequestBody Project project) {
		return service.create(project);
	}
	@GetMapping
	public List<Project> retrieveAllFood(){
		return service.read();
	}
	@GetMapping("/{id}")
	public Project findfoodByid(@PathVariable("id") Long id) {
		return service.readById(id);
	}
	@PutMapping
	public Project updateProject(@RequestBody Project project) {
		return service.update(project);
	}
	@DeleteMapping("/{id}")
	public Project deleteProject(@PathVariable("id") Long id) {
		return service.delete(id);
	}


}
