package com.kn.entities;

import java.util.*;

public class Employee {
	List<String> technologies;
	Set<String> projects;
	Map<String, String> organization;
	public Employee() {
	}
	public Employee(List<String> technologies, Set<String> projects, Map<String, String> organization) {
		this.technologies = technologies;
		this.projects = projects;
		this.organization = organization;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getOrganization() {
		return organization;
	}
	public void setOrganization(Map<String, String> organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", organization=" + organization
				+ "]";
	}
}
