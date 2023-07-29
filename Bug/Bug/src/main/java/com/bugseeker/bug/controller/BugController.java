package com.bugseeker.bug.controller;


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

import com.bugseeker.bug.model.Bug;
import com.bugseeker.bug.service.BugService;

@RestController
@RequestMapping("/bug")
public class BugController {
	
	@Autowired
	private BugService bs;
	
	@GetMapping
	public List<Bug> viewAllBugs() {
		return bs.findAll();
	}
	
	@GetMapping("/{id}")
	public Bug viewById(@PathVariable("id") Double id) {
		Bug bug = bs.findById(id);
		return bug;
	}
	
	@PostMapping
	public Object addBug(@RequestBody Bug bug) {
		return bs.create(bug);
	}
	
	@PutMapping
	public Bug updateBug(@RequestBody Bug bug ) {
		return bs.update(bug);
	}
	
	@DeleteMapping("/{id}")
	public Bug deleteBug(@PathVariable("id") Double id) {
		return bs.delete(id);
	}

}
