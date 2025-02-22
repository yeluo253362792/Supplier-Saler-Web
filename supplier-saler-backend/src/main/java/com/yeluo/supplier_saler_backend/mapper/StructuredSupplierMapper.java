package com.yeluo.supplier_saler_backend.mapper;

import com.yeluo.supplier_saler_backend.model.StructuredSupplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StructuredSupplierMapper {

    StructuredSupplier findById(@Param("id") Integer id);

    List<StructuredSupplier> findByPage(@Param("pageSize") int pageSize, @Param("offset") int offset);

    void insert(StructuredSupplier structuredSupplier);

    void update(StructuredSupplier structuredSupplier);

    void delete(@Param("id") Integer id);
}
