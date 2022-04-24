package com.example.sping11ormmappingonetoone.repository;

import com.example.sping11ormmappingonetoone.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region,Integer> {
}
