package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Valid
    @NotBlank(message="Location is required")
    @Size(min=4, max=30, message="Location must be between 4 and 30 characters")
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
