package com.uday.model;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name ;
	}
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Employee emp) {
		if(( emp.getId()==this.getId() ) && (emp.getName().equals(emp.getName()))){
			return 0;
		}
		return 1;
	}

}
