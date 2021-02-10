package com.primeiro.exercicio.primeiro_exercicio_poo.DTOs;

public class EmployeeDTO {
    private Integer employeeID;
    private String  name;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public EmployeeDTO(Integer employeeID, String employeeName){
        setEmployeeID(employeeID);
        setName(employeeName);
    }
}
