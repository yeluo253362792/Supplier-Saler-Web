package com.yeluo.supplier_saler_backend.mapper;

import com.yeluo.supplier_saler_backend.model.RawSupplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface RawSupplierMapper {
    RawSupplier findById(@Param("id") Integer id);

    List<RawSupplier> findAll();

    List<RawSupplier> findByPage(@Param("pageSize") int pageSize, @Param("offset") int offset);

    void insert(RawSupplier rawSupplier);

    void update(RawSupplier rawSupplier);

    void delete(@Param("id") Integer id);
}