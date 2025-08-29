package com.github.gabrielsilper.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String continent;
    private List<State> states;

    public Country() {
        this.states = new ArrayList<>();
    }

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
        this.states = new ArrayList<>();
    }

    public Country(String name, String continent, List<State> states) {
        this.name = name;
        this.continent = continent;
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public List<State> getStates() {
        return states;
    }

    public void addState(State state) {
        if (states != null && !states.contains(state)){
            states.add(state);
        }
        if (state.getCountry() == null || state.getCountry() != this) {
            state.setCountry(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(continent, country.continent) && Objects.equals(states, country.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, continent, states);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
