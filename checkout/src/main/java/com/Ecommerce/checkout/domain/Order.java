package com.Ecommerce.checkout.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private UUID id;
    private String numeroPedido;
    private UUID clientID;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private String moeda;
    private BigDecimal valor_subTot;
    private BigDecimal valorDesc;
    private BigDecimal valorFret;
    private BigDecimal valorTotal;
    private String idempotency_key;
    private LocalDateTime creatAt;
    private LocalDateTime upDateAt;

    @PrePersist
    public void prePersist() {
        this.creatAt = LocalDateTime.now();
        this.upDateAt = this.creatAt;
    }

    @PreUpdate
    public void preUpdate() {
        this.upDateAt = LocalDateTime.now();
    }




}
