package com.ncr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kartik
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonData extends PersonBasicData {
    private String address;
    private int salary;
    private String company;
}
