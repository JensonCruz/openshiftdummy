package com.example.demo.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.openshift.model.Employee;

@RestController
public class DemoController {
	
	@GetMapping(value="/getEmployee")
	private Employee getEmployee() {
		Employee emp = new Employee();
		emp.setAge(26);
		emp.setName("Orlen");
		emp.setDesgination("CEO");
		return emp;
	}


}
