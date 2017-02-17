package com.botkul.spring.model.repository;

import java.util.Collection;
import com.botkul.spring.model.Employee;

public interface EmployeeDao {
	public Collection<Employee> findAll();
	public Employee findOne(long id);
}
