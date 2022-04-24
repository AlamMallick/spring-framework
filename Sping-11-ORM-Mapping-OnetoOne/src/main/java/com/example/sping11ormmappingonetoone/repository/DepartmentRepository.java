package com.example.sping11ormmappingonetoone.repository;

import com.example.sping11ormmappingonetoone.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Employees,Integer> {
}
