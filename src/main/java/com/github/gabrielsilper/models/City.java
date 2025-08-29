package com.github.gabrielsilper.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private State state;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public City(String name, State state) {
        this.name = name;
        this.state = state;
        state.addCity(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        state.addCity(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(state, city.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
