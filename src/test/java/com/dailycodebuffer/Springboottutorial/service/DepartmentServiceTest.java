package com.dailycodebuffer.Springboottutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.repository.DepartmentRepository;

@SpringBootTest
public class DepartmentServiceTest {
	
	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private  DepartmentRepository departmentRepository;

	@BeforeEach //beforeall,afterAll
	void setUp() {
	Department department=Department.builder()
			              .departmentName("IT")
			              .departmentAddress("delhi")
			              .DepartmentId(1L)
			              .departmentCode("CS-1").build();
	Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
	.thenReturn(department);
	
				             
				      				              
	}
	@Test
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
	  String departmentName="IT";
	  Department found =departmentService.fetchDepartmentByName(departmentName);
	  assertEquals(departmentName, found.getDepartmentName());
	  
	}
}
