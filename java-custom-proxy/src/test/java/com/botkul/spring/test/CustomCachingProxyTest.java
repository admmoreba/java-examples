package com.botkul.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.botkul.spring.model.repository.EmployeeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class CustomCachingProxyTest {

	@Resource(name="employeeDao")
	EmployeeDao empDaoProxy;
	
	@Test
	public void testProxyCall(){
		System.out.println(empDaoProxy.findAll());
		System.out.println(empDaoProxy.findAll());
		
		System.out.println(empDaoProxy.findOne(1));
		System.out.println(empDaoProxy.findOne(1));
		
		System.out.println(empDaoProxy.findOne(2));
		System.out.println(empDaoProxy.findOne(2));
	}
}
