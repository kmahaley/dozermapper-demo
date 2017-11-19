package com.ncr.model.nestedmapping;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kartik
 */
@Data
@AllArgsConstructor
public class Name {

    private String first;
    private String last;
    private String fullName;
}
