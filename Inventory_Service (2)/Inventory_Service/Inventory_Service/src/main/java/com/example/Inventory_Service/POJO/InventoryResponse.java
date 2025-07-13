package com.example.Inventory_Service.POJO;

public class InventoryResponse {
    private boolean inStock;
    private String message;

    // Constructor
    public InventoryResponse(boolean inStock, String message) {
        this.inStock = inStock;
        this.message = message;
    }

    // Getters and Setters
    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
