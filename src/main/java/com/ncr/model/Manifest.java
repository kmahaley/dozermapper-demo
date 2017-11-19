package com.ncr.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kartik
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manifest {
    private String currency;

    private String type;

    private List<Integer> items = new ArrayList<>();
}
