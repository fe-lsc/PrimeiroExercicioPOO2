package com.primeiro.exercicio.primeiro_exercicio_poo.Repository;

import java.util.ArrayList;
import java.util.List;

import com.primeiro.exercicio.primeiro_exercicio_poo.Entities.Employee;

import org.springframework.stereotype.Component;

@Component
public class RepositoryEmployee {
    public List<Employee> getEmployees(){
        Employee e1 = new Employee();
        e1.setAge(25);
        e1.setEmployeeID(01);
        e1.setName("Alfredo, O Valente");
        e1.setSalary(2500.00);

        Employee e2 = new Employee();
        e2.setAge(31);
        e2.setEmployeeID(02);
        e2.setName("Jonathan, O Jovem");
        e2.setSalary(2000.00);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        return employeeList;
    }
}
