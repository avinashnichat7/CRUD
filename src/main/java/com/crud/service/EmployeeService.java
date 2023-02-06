package com.crud.service;

import com.crud.Employee.Employee;
import com.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    public List<Employee> getEmployee(Employee employeeId);

    public Employee updateEmployee(Integer id);

    public void deleteEmployee(Employee empId);

}
