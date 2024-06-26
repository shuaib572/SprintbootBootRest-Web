package com.coding.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.model.Student;

import ch.qos.logback.core.status.Status;

@RestController
public class MyRestController {
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent()
	{
		return new ResponseEntity<String>("From Student",HttpStatus.OK);
	}
	@PostMapping("/update")
	public ResponseEntity<String> updateStudent()
	{
		return new ResponseEntity<String>("From Update",HttpStatus.OK);
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<String> deleteStudent()
	{
		return new ResponseEntity<String>("From Delete",HttpStatus.OK);
	}
	
	@GetMapping("fetch")
	public ResponseEntity<String> fetchStudent(){
		return new ResponseEntity<String>("From Fetch",HttpStatus.OK);
	}
	
	@GetMapping("/a")
	public String m1() {
		return "Method m1";
	}
	
	@GetMapping("/b")
	public Integer m2()
	{
		return 12;
	}
	@GetMapping("/c")
	public Double m3() {
		return 45.434;
		
	}
	
	@GetMapping("/d")
	public List<String> m4()
	{
		return Arrays.asList("shuaib","sad","Adfsa");
	}
	@GetMapping("/e")
	public Student m5()
	{
		return new Student(1,"shuiab","haldwani");
	}
	
	

}
