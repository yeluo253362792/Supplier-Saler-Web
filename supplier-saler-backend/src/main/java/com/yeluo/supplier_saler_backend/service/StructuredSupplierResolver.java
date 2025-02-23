package com.yeluo.supplier_saler_backend.service;

import com.alibaba.fastjson2.JSONObject;
import com.yeluo.supplier_saler_backend.model.RawSupplier;
import com.yeluo.supplier_saler_backend.model.StructuredSupplier;
import lombok.Data;


public class StructuredSupplierResolver {

    public static StructuredSupplier resolveFromRawSupplier(RawSupplier rawSupplier) {
        if(rawSupplier==null) {
            return null;
        }

        ContentModel contentModel = JSONObject.parseObject(rawSupplier.getContent(), ContentModel.class);
        if(contentModel==null) {
            return null;
        }

        TempModel tempModel = JSONObject.parseObject(contentModel.getTempModel(), TempModel.class);
        if(tempModel==null) {
            return null;
        }

        StructuredSupplier structuredSupplier = new StructuredSupplier();
        structuredSupplier.setRawSourceId(rawSupplier.getId());
        structuredSupplier.setName(tempModel.getOfferTitle());
        structuredSupplier.setUrl(rawSupplier.getUrl());
        structuredSupplier.setHeadImage(tempModel.getDefaultOfferImg());

        return structuredSupplier;
    }

    @Data
    static class ContentModel {
        private String url;
        private String skuModel;
        private String tempModel;
        private String orderParamModel;
    }

    @Data
    static class TempModel {
        private Long offerId;
        private String offerTitle;
        private String defaultOfferImg;
        private String offerUnit;
    }
}
