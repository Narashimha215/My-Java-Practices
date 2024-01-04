package com.kn.entities;

public class University {
	int id;
	String name;
	String trainer;
	public University() {
	}
	public University(int id, String name, String trainer) {
		this.id = id;
		this.name = name;
		this.trainer = trainer;
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
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", trainer=" + trainer + "]";
	}
}