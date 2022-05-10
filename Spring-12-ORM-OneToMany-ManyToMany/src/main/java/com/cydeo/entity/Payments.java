package com.cydeo.entity;

import com.cydeo.enums.PaymentStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "payments")


public class Payments extends BaseEntity {

    private BigDecimal amount;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private  BigDecimal paymentDetailId;





}
