package com.cydeo.repository;

import com.cydeo.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payments,Long> {

}
