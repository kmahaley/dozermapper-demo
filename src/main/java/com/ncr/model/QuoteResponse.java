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
public class QuoteResponse {
    private String id;
    private int fee;
    private String requestedAt;
    private String partnerName;
}
