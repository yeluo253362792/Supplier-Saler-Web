package com.yeluo.supplier_saler_backend.controller;

import com.yeluo.supplier_saler_backend.model.RawSupplier;
import com.yeluo.supplier_saler_backend.service.RawSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier/raw")
public class RawSupplierController {

    @Autowired
    private RawSupplierService rawSupplierService;

    @GetMapping("/{id}")
    public ResponseEntity<RawSupplier> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(rawSupplierService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<RawSupplier>> findByPage(
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "1") int pageNum) {
        return ResponseEntity.ok(rawSupplierService.findByPage(pageSize, pageNum));
    }

    @PostMapping
    public ResponseEntity<RawSupplier> create(@RequestBody RawSupplier rawSupplier) {
        return ResponseEntity.ok(rawSupplierService.create(rawSupplier));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RawSupplier> update(
            @PathVariable Integer id,
            @RequestBody RawSupplier rawSupplier) {
        return ResponseEntity.ok(rawSupplierService.update(id, rawSupplier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        rawSupplierService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/process")
    public ResponseEntity<Void> process(@RequestBody List<Integer> ids) {
        rawSupplierService.process(ids);
        return ResponseEntity.ok().build();
    }
}
