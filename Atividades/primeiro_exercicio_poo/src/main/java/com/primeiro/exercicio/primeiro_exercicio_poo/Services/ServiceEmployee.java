package com.primeiro.exercicio.primeiro_exercicio_poo.Services;

import java.util.ArrayList;
import java.util.List;

import com.primeiro.exercicio.primeiro_exercicio_poo.DTOs.EmployeeDTO;
import com.primeiro.exercicio.primeiro_exercicio_poo.Entities.Employee;
import com.primeiro.exercicio.primeiro_exercicio_poo.Repository.RepositoryEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmployee {
    
    @Autowired
    private RepositoryEmployee employeeRepository;

	public List<EmployeeDTO> getEmployeesDTO() {
		List<Employee> employeesList = employeeRepository.getEmployees();
        List<EmployeeDTO> employeesListDTO = toDTO(employeesList);

        return employeesListDTO;
	}

    private List<EmployeeDTO> toDTO(List<Employee> employees) {
        List<EmployeeDTO> employeeDTO = new ArrayList<>();
        
        for(Employee employeeAux : employees){
            employeeDTO.add(new EmployeeDTO(employeeAux.getEmployeeID(), employeeAux.getName()));
        }
        
        return employeeDTO;
    }


}
