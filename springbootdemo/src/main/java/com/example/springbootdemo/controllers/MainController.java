package com.example.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootdemo.entities.Employee;

@Controller
public class MainController {
	
@Autowired
	EmpService empservice;

	@RequestMapping("/hello")
	public ModelAndView hello()
	{System.out.println("inside Back Controller....");
		ModelAndView mv=new ModelAndView("hello");
		mv.addObject("msg","Hello Spring MVC with Boot");
		return mv;
		
	}
	
	@RequestMapping("/insertEmp")
	public ModelAndView insertEmp(@ModelAttribute Employee e)
	{
		ModelAndView mv=new ModelAndView("hello");
		System.out.println("EMPLOYEE>>>>>"+e);
		//EmpService empservice=new EmpService();
	int x=empservice.insertEmp(e);
		if(x!=0)
		mv.addObject("msg","Data inseted...");
		return mv;
	}
	
	
	
	
}

