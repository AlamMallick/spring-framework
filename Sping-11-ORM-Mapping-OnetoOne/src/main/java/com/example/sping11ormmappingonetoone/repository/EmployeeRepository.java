package com.example.sping11ormmappingonetoone.repository;

import com.example.sping11ormmappingonetoone.entity.Employee;
import com.example.sping11ormmappingonetoone.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
