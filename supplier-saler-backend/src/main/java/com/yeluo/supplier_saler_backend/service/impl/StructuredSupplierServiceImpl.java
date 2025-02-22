package com.yeluo.supplier_saler_backend.service.impl;

import com.yeluo.supplier_saler_backend.mapper.StructuredSupplierMapper;
import com.yeluo.supplier_saler_backend.model.StructuredSupplier;
import com.yeluo.supplier_saler_backend.service.StructuredSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructuredSupplierServiceImpl implements StructuredSupplierService {

    @Autowired
    private StructuredSupplierMapper structuredSupplierMapper;

    @Override
    public StructuredSupplier findById(Integer id) {
        return structuredSupplierMapper.findById(id);
    }

    @Override
    public List<StructuredSupplier> findByPage(int pageSize, int pageNum) {
        int offset = (pageNum - 1) * pageSize;
        return structuredSupplierMapper.findByPage(pageSize, offset);
    }

    @Override
    public StructuredSupplier insert(StructuredSupplier structuredSupplier) {
        structuredSupplierMapper.insert(structuredSupplier);
        return structuredSupplier;
    }

    @Override
    public StructuredSupplier update(StructuredSupplier structuredSupplier) {
        structuredSupplierMapper.update(structuredSupplier);
        return structuredSupplier;
    }

    @Override
    public void delete(Integer id) {
        structuredSupplierMapper.delete(id);
    }
}
