package com.example.Inventory_Service.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping("/check")
    public ResponseEntity<Boolean> checkInventory(@RequestParam String productId) {
        // Simulate inventory check
        return ResponseEntity.ok(true); // Always in stock
    }
}
