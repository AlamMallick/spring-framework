package com.example.bootstrap;

import com.example.repository.CourseRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }
    @Override
    public void run(String... args) throws Exception {


        System.out.println("-----------------REGION START-----------------");

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));

        System.out.println("findDistinctByCountry:" + regionRepository.findDistinctByCountry("Canada"));

        System.out.println("findByCountryContains:" + regionRepository.findByCountryContains("United"));

        System.out.println("findByCountryContainsOrderByCountry:" + regionRepository.findByCountryContainsOrderByCountry("Asia"));

        System.out.println("    findTop2ByCountry:" + regionRepository.findTop2ByCountry("Canada"));


        System.out.println("-----------------REGION END-----------------");



        System.out.println("-----------------Department START-----------------");
        System.out.println("findByDepartment:" + departmentRepository.findByDepartment("Toys"));
        System.out.println("findByDivisionIs:" + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContains:" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));



        System.out.println("-----------------Department END-----------------");



    }
}
