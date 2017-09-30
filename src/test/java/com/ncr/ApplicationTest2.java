package com.ncr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ncr.model.Order;
import com.ncr.model.OrderView;
import com.ncr.model.Status;
import com.ncr.model.StatusPrime;
import com.ncr.service.mapping.MappingBuilder;

/**
 * @author km185223
 */
public class ApplicationTest2 {
    final DozerBeanMapper mapper = new DozerBeanMapper();
    Order order;
    OrderView orderView;

    @Before
    public void setup(){
        MappingBuilder mappingBuilder = new MappingBuilder();
        List<String> mappingFiles=new ArrayList<String>();

        mapper.setMappingFiles(mappingFiles);
        mapper.addMapping(mappingBuilder);

        order=buildOrderObject();
        orderView=buildOrderViewObject();
    }

    private OrderView buildOrderViewObject() {
        OrderView orderView;
        String id=UUID.randomUUID().toString();
        List<String> list= Arrays.asList("cinnamon","cardamom","kiwi");
        orderView=new OrderView(id,12,400.40,"New York City", StatusPrime.PROCESSING, list);
        return orderView;
    }

    private Order buildOrderObject() {
        Order order;
        String id=UUID.randomUUID().toString()+"!"+"MyOrg";
        List<String> list= Arrays.asList("apple","mango","banana");
        order=new Order(id,23,234.39,"Boston City", Status.SUBMITTED,list);
        return order;
    }

    @Test
    public void test1(){
        OrderView orderView = mapper.map(order, OrderView.class);
        Assert.assertTrue(order.getCost()==orderView.getOrderCost());
        Assert.assertTrue(orderView.getListOfItemName().size()==3);
    }

    @Test
    public void test2(){
        Order order = mapper.map(orderView, Order.class);
        Assert.assertTrue(order.getCost()==orderView.getOrderCost());
        Assert.assertTrue(order.getId().equals(orderView.getOrderViewId()));
        Assert.assertEquals(12, order.getItems());
    }
}
