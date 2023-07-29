package com.ust.bugtrackerapp.repository;

import org.springframework.stereotype.Repository;

import com.ust.bugtrackerapp.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProjectRepository  extends JpaRepository<Project,Long>{

}
