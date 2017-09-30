package com.ncr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author km185223
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    private String firstName;
    private String lastName;
    private int ageLived;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgeLived() {
        return ageLived;
    }

    public void setAgeLived(int ageLived) {
        this.ageLived = ageLived;
    }
}
