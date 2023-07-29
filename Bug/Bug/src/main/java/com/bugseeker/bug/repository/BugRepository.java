package com.bugseeker.bug.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugseeker.bug.model.Bug;

@Repository
public interface BugRepository extends JpaRepository<Bug,Double>{

}
