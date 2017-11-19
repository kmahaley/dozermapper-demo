package com.ncr.service.mapping;

import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;

import com.ncr.model.Order;
import com.ncr.model.OrderView;

/**
 * @author kartik
 */
public class MappingBuilder extends BeanMappingBuilder {
    @Override
    protected void configure() {
        mapping(Order.class, OrderView.class)
                .fields("id", "orderViewId", FieldsMappingOptions.customConverter(IdCustomConverter.class))
                .fields("items", "listOfItems")
                .fields("cost", "orderCost")
                .fields("siteName", "siteName")
                .fields("itemNames", "listOfItemName");

    }
}
