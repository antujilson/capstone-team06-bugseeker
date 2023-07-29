package com.bugseeker.bug.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugseeker.bug.model.Bug;
import com.bugseeker.bug.repository.BugRepository;

@Service
public class BugService {
	
	@Autowired
	private BugRepository br;
	
	public List<Bug> findAll() {
		return br.findAll();
	}
	
	public Bug  findById(Double id) {
		Optional<Bug> temp = br.findById(id);
		Bug b = null;
		if(temp.isPresent()) {
			b= temp.get();
		}
		return b;
	}
	
	public Object create(Bug bug) {
		return br.save(bug);
	}
	
	public Bug update(Bug bug) {
		Bug d = findById(bug.getId());
		if(d!=null) {
			d=bug;
			br.save(d);
		}
		return d;
	}
	
	public Bug delete(Double id) {
		Bug d = findById(id);
		if(d!= null) {
			br.delete(d);
		}
		return d;
	}
	
	
}
