package com.botkul.spring.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.botkul.spring.model.Employee;

@Repository
public class EmployeeDaoBean implements EmployeeDao {
	private static Map<Long, Employee> emps;
	static{
		emps=new HashMap<>();
		emps.put(1L,new Employee(1,"Balaji"));
		emps.put(2L,new Employee(2,"Ira"));
		emps.put(3L,new Employee(3,"Supriya"));
		emps.put(4L,new Employee(4,"Hanumant"));
	}
	
	public Collection<Employee> findAll() {
		return emps.values();
	}

	public Employee findOne(long id) {
		return emps.get(id);
	}
}
