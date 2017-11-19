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
public class PersonBasicData {
    private String name;
    private int age;
}
