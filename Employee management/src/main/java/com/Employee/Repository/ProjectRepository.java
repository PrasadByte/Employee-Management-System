package com.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
