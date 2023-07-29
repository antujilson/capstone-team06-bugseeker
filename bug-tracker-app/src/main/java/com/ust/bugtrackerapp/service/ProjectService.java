package com.ust.bugtrackerapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.bugtrackerapp.entity.Project;
import com.ust.bugtrackerapp.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository repo;
	
	public Project create(Project pjt) {
		return repo.save(pjt);
		
	}
	
	public List<Project> read(){
		return repo.findAll();
		
	}
	public Project readById(Long id) {
		Optional<Project> temp=repo.findById(id);
		Project project=null;
		if(temp.isPresent()) {
			project=temp.get();
		}
		return project;
	}
	public Project update(Project pjt) {
		Project p=readById(pjt.getPjt_id());
		if(p!=null) {
			p=pjt;
			repo.save(p);
		}
		return p;
	}
	public Project delete(Long id) {
		Project f=readById(id);
		if(f!=null) {
			repo.delete(f);
		}
		return f;
	}
	

}
