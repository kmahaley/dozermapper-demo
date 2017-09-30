package com.ncr.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author km185223
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderView {
    private String orderViewId;
    private int listOfItems;
    private double orderCost;
    private String siteName;
    private StatusPrime status;
    private List<String> listOfItemName;


}
