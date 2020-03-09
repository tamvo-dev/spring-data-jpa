package com.learnspringboot.demo;

import com.learnspringboot.demo.models.Employee;
import com.learnspringboot.demo.models.Phone;
import com.learnspringboot.demo.repository.EmployeeRepository;
import com.learnspringboot.demo.repository.PhoneRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class);
		PhoneRepository phoneRepository = context.getBean(PhoneRepository.class);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

		Employee employee = new Employee(1l, "Vo", "Tam", 1l, null);
		employeeRepository.save(employee);

		Phone phone1 = new Phone(1l,"Home","0859292357", employee);
		Phone phone2 = new Phone(2l,"Work","0859292357", employee);
		phoneRepository.save(phone1);
		phoneRepository.save(phone2);
	}

}
