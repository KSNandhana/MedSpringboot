package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta  .persistence.*;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}