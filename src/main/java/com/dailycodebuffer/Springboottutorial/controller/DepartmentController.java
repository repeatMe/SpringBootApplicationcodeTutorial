package com.dailycodebuffer.Springboottutorial.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboottutorial.service.DepartmentService;
import com.dailycodebuffer.Springboottutorial.service.DepartmentServiceImpl;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	private final Logger LOGGER=LoggerFactory.getLogger(DepartmentController.class);
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("inside  save department of DepartmentController");
		return departmentService.saveDepartment(department);
		}
	@GetMapping("/departments")
	public List<Department>fetchDepartmentLlist(){
		LOGGER.info("inside fetch department list of department controller");
		return departmentService.fetchDepartmentList();
	}
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) 
			
			
			throws DepartmentNotFoundException {
		LOGGER.info("inside fetch department list by id");
		return departmentService.fetchDepartmentById(departmentId);
		}
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("inside fetch delete department by id method of Department controller");
		 departmentService.deleteDepartmentById(departmentId);
		 return "department deleted successfully";
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartmentById(@PathVariable("id") Long departmentId,
			                                  @RequestBody Department department)
	{
		LOGGER.info("inside update department by id method of department controller ");
		return departmentService.updateDepartmentById(departmentId,department);
		
	}
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
	LOGGER.info("inside fetch department by name method of Department controller");
	return departmentService.fetchDepartmentByName(departmentName);
	
	}
}
