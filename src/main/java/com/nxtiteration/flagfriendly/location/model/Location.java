package com.nxtiteration.flagfriendly.location.model;

import jakarta.persistence.Entity;

@Entity
public class Location {

    private long id;
    private String addressLine1;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
}

