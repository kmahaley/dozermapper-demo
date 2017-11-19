package com.ncr.model;

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
public class QuoteRequest {
    private String pickupAddress;
    private String dropoffAddress;
    private String pickupTime;
    private String dropoffTime;
    private Person person;
    private PersonIdData id;
}
