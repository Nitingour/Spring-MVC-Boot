package com.example.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.dao.EmpDAO;
import com.example.springbootdemo.entities.Employee;

@Service
public class EmpService {

	@Autowired
	EmpDAO empdao;
	
	public int insertEmp(Employee e) {
		int x=0;
		Object o=empdao.save(e);
       if(o!=null)
	    x=1;
		return x;
	}

	public Iterable<Employee> getAllEmp() {
		return empdao.findAll();//select * from Employee
	}

	
	
}
