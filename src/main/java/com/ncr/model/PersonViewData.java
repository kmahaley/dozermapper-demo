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
public class PersonViewData extends PersonData {
    PersonIdData idData;

}
