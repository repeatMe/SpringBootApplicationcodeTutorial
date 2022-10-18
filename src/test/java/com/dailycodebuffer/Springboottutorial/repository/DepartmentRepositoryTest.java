package com.dailycodebuffer.Springboottutorial.repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class DepartmentRepositoryTest {
	
	@Autowired
	private  DepartmentRepository departmentRepository;
	
	@Autowired//testentity manager is provided by those people
	private TestEntityManager entityManager;
	
 @BeforeEach
 void setUp() {
	 
 }
}
