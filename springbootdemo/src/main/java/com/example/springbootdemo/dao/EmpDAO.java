package com.example.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootdemo.entities.Employee;

public interface EmpDAO  extends  CrudRepository<Employee, Integer>{
	
}
