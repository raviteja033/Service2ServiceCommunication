package com.example.Order_Service.POJO;

public class OrderRequest {
    private String orderId;
    private String ProductId;

    public OrderRequest(String orderId, String productId) {
        this.orderId = orderId;
        ProductId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }
}
