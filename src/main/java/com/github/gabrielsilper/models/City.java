package com.github.gabrielsilper.models;

import java.io.Serial;
import java.io.Serializable;

public class City implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private State state;

    public City() {
    }

    public City(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getEstado() {
        return state;
    }

    public void setEstado(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
