package com.yeluo.supplier_saler_backend.service;

import com.yeluo.supplier_saler_backend.model.StructuredSupplier;
import java.util.List;

public interface StructuredSupplierService {
    StructuredSupplier findById(Integer id);
    List<StructuredSupplier> findByPage(int pageSize, int pageNum);
    StructuredSupplier insert(StructuredSupplier structuredSupplier);
    StructuredSupplier update(StructuredSupplier structuredSupplier);
    void delete(Integer id);
}
