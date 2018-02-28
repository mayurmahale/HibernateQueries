package com.scp.hibernatequeries.hql.createquery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_age")
	private int age;
	
	@Column(name="emp_salary")
	private double empSalary;

	public Employee()
	{
		super();
	}

	public Employee(String empName, int age, double empSalary)
	{
		super();
		this.empName = empName;
		this.age = age;
		this.empSalary = empSalary;
	}

	public long getEmpId()
	{
		return empId;
	}

	/*public void setEmpId(long empId)
	{
		this.empId = empId;
	}*/

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary)
	{
		this.empSalary = empSalary;
	}

	@Override
	public String toString()
	{
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", empSalary=" + empSalary + "]";
	}
	
	
	
	

}
