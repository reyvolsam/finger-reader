package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import FingerReader.Models.Employees;
import Repository.EmployeesRepository;

@Service
@EnableJpaRepositories({"Repository"})
@EntityScan("Models")
public class Employee {

	@Autowired
	private EmployeesRepository employeesRepository;
	
	public List<Employees> getEmployeeList(){
		
    	List<Employees> employee_list = employeesRepository.findAll();
    	
    	for(Employees employee: employee_list) {
    		System.out.println(employee.getRfc());
    		
    	}
    	return employee_list;
	}
}
