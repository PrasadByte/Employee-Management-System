package com.Employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Service.ProjectService;
import com.Employee.entity.Project;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectservice;
	@PostMapping("/addproject")
	// api to add project
	public String inserProject(@RequestBody Project project) {
		projectservice.createProject(project);
		return "project inserted successfuly";
	}
	// Retrive the project from the database
	@GetMapping("/getall")
	public List<Project>fetchProject(){
		return projectservice.getProject();
	
	}
	
	//api for the delete project by id
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable int id){
		boolean isDeleted = employeeservice.
	}
	
	
	// api for fetch perticular project
	
	@GetMapping("/getbyidprojrct")
	public Optional<Project>fetchById(@PathVariable int id){
		return projectservice.getParticularProject(id);
	}
	//api for update the project
	@PutMapping("/updateproject")
	public Project updateproject(@RequestBody Project project) {
		projectservice.updateProject(project);
		return project;
	}
	//api for the deleting the project
	
}
