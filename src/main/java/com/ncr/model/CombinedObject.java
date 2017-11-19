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
public class CombinedObject {
    private String pickupAddress;
    private String dropoffAddress;
    private String pickupTime;
    private String dropoffTime;
    private String id;
    private int fee;
    private String requestedAt;
    private String partnerName;
}
