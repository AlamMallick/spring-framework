package com.example.sping11ormmappingonetoone.repository;

import com.example.sping11ormmappingonetoone.entity.Department;
import com.example.sping11ormmappingonetoone.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
