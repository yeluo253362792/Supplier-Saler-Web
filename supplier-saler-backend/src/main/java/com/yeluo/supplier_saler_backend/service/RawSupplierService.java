package com.yeluo.supplier_saler_backend.service;

import com.yeluo.supplier_saler_backend.model.RawSupplier;
import java.util.List;

public interface RawSupplierService {
    RawSupplier findById(Integer id);
    List<RawSupplier> findAll();
    List<RawSupplier> findByPage(int pageSize, int pageNum);
    RawSupplier create(RawSupplier rawSupplier);
    RawSupplier update(Integer id, RawSupplier rawSupplier);
    void delete(Integer id);
    void process(List<Integer> ids);
}
