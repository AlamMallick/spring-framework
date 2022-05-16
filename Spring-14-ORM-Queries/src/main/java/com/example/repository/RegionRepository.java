package com.example.repository;

import com.example.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    List<Region> findByCountry(String country);
    List<Region> findDistinctByCountry(String country);
    List<Region> findByCountryContains(String country);
    List<Region> findByCountryContainsOrderByCountry(String Country);
List<Region> findTop2ByCountry(String country);

}
