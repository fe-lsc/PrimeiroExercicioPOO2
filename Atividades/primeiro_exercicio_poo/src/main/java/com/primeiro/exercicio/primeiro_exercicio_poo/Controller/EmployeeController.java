package com.primeiro.exercicio.primeiro_exercicio_poo.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.primeiro.exercicio.primeiro_exercicio_poo.DTOs.EmployeeDTO;
import com.primeiro.exercicio.primeiro_exercicio_poo.Services.ServiceEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    

    @Autowired
    private ServiceEmployee serviceEmployee;
    
    @GetMapping()
    public ResponseEntity<List<EmployeeDTO>> getEmployees() {
        List<EmployeeDTO> employeesDTO = serviceEmployee.getEmployeesDTO();
        return ResponseEntity.ok().body(employeesDTO);
    }
    

}
