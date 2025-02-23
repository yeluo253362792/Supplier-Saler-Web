package com.yeluo.supplier_saler_backend.service.impl;

import com.yeluo.supplier_saler_backend.mapper.RawSupplierMapper;
import com.yeluo.supplier_saler_backend.mapper.StructuredSupplierMapper;
import com.yeluo.supplier_saler_backend.model.RawSupplier;
import com.yeluo.supplier_saler_backend.model.StructuredSupplier;
import com.yeluo.supplier_saler_backend.service.RawSupplierService;
import com.yeluo.supplier_saler_backend.service.StructuredSupplierResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RawSupplierServiceImpl implements RawSupplierService {

    @Autowired
    private RawSupplierMapper rawSupplierMapper;

    @Autowired
    private StructuredSupplierMapper structuredSupplierMapper;

    @Override
    public RawSupplier findById(Integer id) {
        return rawSupplierMapper.findById(id);
    }

    @Override
    public List<RawSupplier> findAll() {
        return rawSupplierMapper.findAll();
    }

    @Override
    public List<RawSupplier> findByPage(int pageSize, int pageNum) {
        int offset = (pageNum - 1) * pageSize;
        return rawSupplierMapper.findByPage(pageSize, offset);
    }

    @Override
    @Transactional
    public RawSupplier create(RawSupplier rawSupplier) {
        rawSupplierMapper.insert(rawSupplier);

        StructuredSupplier structuredSupplier = StructuredSupplierResolver.resolveFromRawSupplier(rawSupplier);
        if(structuredSupplier!=null) {
            structuredSupplierMapper.insert(structuredSupplier);
        }

        return rawSupplier;
    }

    @Override
    @Transactional
    public RawSupplier update(Integer id, RawSupplier rawSupplier) {
        rawSupplier.setId(id);
        rawSupplierMapper.update(rawSupplier);
        return rawSupplier;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        rawSupplierMapper.delete(id);
    }

    @Override
    @Transactional
    public void process(List<Integer> ids) {
        // TODO: 实现原始产品供应源的加工逻辑
        // 1. 获取原始产品供应源数据
        // 2. 解析数据，提取结构化信息
        // 3. 创建结构化产品供应源记录
    }
}
