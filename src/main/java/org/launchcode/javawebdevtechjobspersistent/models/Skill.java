package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=5, message="Description must be at least 5 characters")
    private String description;

    public Skill() {
    }
}