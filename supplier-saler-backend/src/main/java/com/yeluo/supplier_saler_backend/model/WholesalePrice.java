package com.yeluo.supplier_saler_backend.model;

import java.time.LocalDateTime;

public class WholesalePrice {
    private Integer id;
    private Integer structuredProductId;
    private Integer minQuantity;
    private Double price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStructuredProductId() {
        return structuredProductId;
    }

    public void setStructuredProductId(Integer structuredProductId) {
        this.structuredProductId = structuredProductId;
    }

    public Integer getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "WholesalePrice{" +
                "id=" + id +
                ", structuredProductId=" + structuredProductId +
                ", minQuantity=" + minQuantity +
                ", price=" + price +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
