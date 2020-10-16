package com.rmit.majorproject.BackEnd.services;

import com.rmit.majorproject.BackEnd.Repositories.EmployeeRepository;
import com.rmit.majorproject.BackEnd.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void add(Employee employee) {
        employeeRepository.save(employee);
    }

    public Iterable<Employee> findAllByName(String name) {
       return employeeRepository.findAllByName(name);
    }

    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    public boolean removeEmployee(Long id) {
        Optional<Employee> employeeOptional = this.employeeRepository.findById(id);

        if (employeeOptional.isPresent()) {
            employeeRepository.delete(employeeOptional.get());
        }

        return employeeOptional.isPresent();
    }
}
