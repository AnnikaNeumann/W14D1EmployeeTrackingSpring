package com.codeclan.example.EmployeeTracking;

import com.codeclan.example.EmployeeTracking.model.Employee;
import com.codeclan.example.EmployeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee charles = new Employee("Charles", 44, "TA556", "charles@gmail.com");
		employeeRepository.save(charles);
	}

}
