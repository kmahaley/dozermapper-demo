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
public class Person {
    private String name;
    private String surname;
    private int age;
}
