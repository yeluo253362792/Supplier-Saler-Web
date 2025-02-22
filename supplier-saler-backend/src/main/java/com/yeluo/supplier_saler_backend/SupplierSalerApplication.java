package com.yeluo.supplier_saler_backend;

import com.yeluo.supplier_saler_backend.config.WebConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.yeluo.supplier_saler_backend.mapper")
@Import(WebConfig.class)
public class SupplierSalerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplierSalerApplication.class, args);
    }
}
