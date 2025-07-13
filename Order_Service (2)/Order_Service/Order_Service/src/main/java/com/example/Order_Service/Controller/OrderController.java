package com.example.Order_Service.Controller;

import com.example.Order_Service.POJO.OrderRequest;
import com.example.Order_Service.POJO.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
    @RestController
    @RequestMapping("/api/order")
    public class OrderController {

        @Autowired
        private RestTemplate restTemplate;

        @PostMapping
        public ResponseEntity<String> placeOrder(@RequestBody OrderRequest request) {
            // 1. Call Inventory Service
            String inventoryUrl = "http://localhost:8081/api/inventory/check?productId=" + request.getProductId();
            Boolean inStock = restTemplate.getForObject(inventoryUrl, Boolean.class);

            if (!inStock) {
                return ResponseEntity.badRequest().body("Product out of stock.");
            }

            // 2. Call Payment Service
            String paymentUrl = "http://localhost:8082/api/payment/pay";
            PaymentRequest paymentRequest = new PaymentRequest();
            paymentRequest.setOrderId(request.getOrderId());

            String paymentResponse = restTemplate.postForObject(paymentUrl, paymentRequest, String.class);

            // 3. Return success
            return ResponseEntity.ok("Order placed. " + paymentResponse);
        }
    }

