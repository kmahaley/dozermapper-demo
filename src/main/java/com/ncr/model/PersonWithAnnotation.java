package com.ncr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dozer.Mapping;

/**
 * @author km185223
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonWithAnnotation {
    @Mapping("name")
    private String fName;
    @Mapping("surname")
    private String lName;
    @Mapping("age")
    private int years;

}
