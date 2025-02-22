package com.yeluo.supplier_saler_backend.controller;

import com.yeluo.supplier_saler_backend.model.StructuredSupplier;
import com.yeluo.supplier_saler_backend.service.StructuredSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier/structured")
public class StructuredSupplierController {

    @Autowired
    private StructuredSupplierService structuredSupplierService;

    @GetMapping("/{id}")
    public ResponseEntity<StructuredSupplier> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(structuredSupplierService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<StructuredSupplier>> findByPage(
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "1") int pageNum) {
        return ResponseEntity.ok(structuredSupplierService.findByPage(pageSize, pageNum));
    }

    @PostMapping
    public ResponseEntity<StructuredSupplier> create(@RequestBody StructuredSupplier structuredSupplier) {
        return ResponseEntity.ok(structuredSupplierService.insert(structuredSupplier));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StructuredSupplier> update(@PathVariable Integer id, @RequestBody StructuredSupplier structuredSupplier) {
        structuredSupplier.setId(id);
        return ResponseEntity.ok(structuredSupplierService.update(structuredSupplier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        structuredSupplierService.delete(id);
        return ResponseEntity.ok().build();
    }
}
