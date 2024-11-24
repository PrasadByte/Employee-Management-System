package com.Employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Repository.ProjectRepository;
import com.Employee.entity.Project;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectrepo;
	//project create
	public void createProject(Project project) {
		projectrepo.save(project);
	}
	// retrive the project 
	public List<Project>getProject(){
		return projectrepo.findAll();
	}
	//get perticular project 
	public Optional<Project>getParticularProject(int id){
			return projectrepo.findById(id);
	}
	//Delete project by id
	public void deleteProjectByid(int id) {
		projectrepo.deleteById(id);
	}
	//Delete All project
	public void deleteAllProject() {
		projectrepo.deleteAll();
	}
	
	//Update project
	
	public void updateProject(Project project) {
		projectrepo.save(project);
	}
}
