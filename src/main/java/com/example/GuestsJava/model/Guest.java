package com.example.GuestsJava.model;

//Universally unique identifier
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Guest {
    private final UUID id;
    private final String name;

    public Guest(@JsonProperty("id") UUID id,
                 @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
