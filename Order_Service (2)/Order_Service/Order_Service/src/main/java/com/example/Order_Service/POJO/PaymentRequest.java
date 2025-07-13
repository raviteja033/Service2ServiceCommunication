package com.example.Order_Service.POJO;

public class PaymentRequest {
    private String orderId;

    public PaymentRequest(String orderId) {
        this.orderId = orderId;
    }

    public PaymentRequest() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
