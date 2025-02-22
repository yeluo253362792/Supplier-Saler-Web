package com.yeluo.supplier_saler_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yeluo.supplier_saler_backend.mapper")
public class SupplierSalerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplierSalerApplication.class, args);
    }
}
