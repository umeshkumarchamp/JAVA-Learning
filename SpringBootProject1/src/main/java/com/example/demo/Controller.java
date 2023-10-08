package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

//	@GetMapping(path = "first")
	@GetMapping("/firstapi")
	public String firstApi() {
		return "This is my first Spring Project"; 
	}
	@GetMapping("/getnames")
	public List<String> printNames(){
		List<String> list = new ArrayList<>(); 
		Collections.addAll(list, "Umesh","Manish","Sweta","Aakash");
		return list; 
	}
	
//	localhost:8989/emp
	@GetMapping("/emp")
	public Employee getEmployee() {
		return new Employee(101, "Umesh Kumar", "Trainer");
	}
	
//	http://localhost:8989/emplist
	@GetMapping("/emplist")
	public List<Employee> emplist() {
		List<Employee> list = new ArrayList<>(); 
		list.add(new Employee(101, "Umesh Kumar", "Trainer")); 
		list.add(new Employee(102, "Manish Rana", "Engineer")); 
		list.add(new Employee(103, "Sweta Verma", "Developer")); 
		list.add(new Employee(104, "Aakash Sahu", "Markeeting")); 
		return list; 
	}
	
	@GetMapping("emp/{id}/{name}/{deg}")
	public Employee emp(@PathVariable(name="id") int ids, 
			@PathVariable(name="name") String empname,
			@PathVariable(name="deg") String empdeg){
			return new Employee(ids, empname, empdeg); 
	};
	
}
