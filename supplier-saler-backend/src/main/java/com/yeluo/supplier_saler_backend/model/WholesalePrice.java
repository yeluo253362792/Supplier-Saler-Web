package com.yeluo.supplier_saler_backend.model;


import java.util.Date;

public class WholesalePrice {
    private Integer id;
    private Integer structuredProductId;
    private Integer minQuantity;
    private Double price;
    private Date createdAt;
    private Date updatedAt;

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
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
