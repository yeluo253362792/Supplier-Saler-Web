package com.yeluo.supplier_saler_backend.mapper;

import com.yeluo.supplier_saler_backend.model.WholesalePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WholesalePriceMapper {

    List<WholesalePrice> findByStructuredProductId(@Param("structuredProductId") Integer structuredProductId);

    void insert(WholesalePrice wholesalePrice);

    void update(WholesalePrice wholesalePrice);

    void deleteByStructuredProductId(@Param("structuredProductId") Integer structuredProductId);
}
