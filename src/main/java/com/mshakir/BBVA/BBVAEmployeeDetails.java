package com.mshakir.BBVA;

public class BBVAEmployeeDetails {
	private String name;
	private String roleInProject;
	private int age;
	private double weeklySalary;
	private int experience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleInProject() {
		return roleInProject;
	}

	public void setRoleInProject(String roleInProject) {
		this.roleInProject = roleInProject;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "BBVAEmployeeDetails [name=" + name + ", roleInProject=" + roleInProject + ", age=" + age
				+ ", weeklySalary=" + weeklySalary + ", experience=" + experience + "]";
	}

}
