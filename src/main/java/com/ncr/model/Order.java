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
public class Order {
    private String id;
    private int items;
    private double cost;
    private String siteName;
    private Status status;
    private List<String> itemNames;

}
