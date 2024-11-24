package com.Employee.entity;

import java.util.Date;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_information")
public class Employee {
    @Id
    private int id;

    @Column(name = "emp_name")
    private String name;

    private String email;
    private String password;
    private Double salary;
    private Date dateOfjoining;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Project> projects;

    // Constructors, Getters, and Setters

    public Employee() {
    }

    public Employee(int id, String name, String email, String password, Double salary, Date dateOfjoining) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
        this.dateOfjoining = dateOfjoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDateOfjoining() {
        return dateOfjoining;
    }

    public void setDateOfjoining(Date dateOfjoining) {
        this.dateOfjoining = dateOfjoining;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
