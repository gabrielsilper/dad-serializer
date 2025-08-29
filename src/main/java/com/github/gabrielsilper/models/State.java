package com.github.gabrielsilper.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String code;
    private Country country;
    private final List<City> cities;

    public State() {
        this.cities = new ArrayList<>();
    }

    public State(String name, String code) {
        this.name = name;
        this.code = code;
        this.cities = new ArrayList<>();
    }

    public State(String name, String code, Country country) {
        this.name = name;
        this.code = code;
        this.country = country;
        this.cities = new ArrayList<>();
    }

    public State(String name, String code, Country country, List<City> cities) {
        this.name = name;
        this.code = code;
        this.country = country;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
        country.addState(this);
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city) {
        if (cities != null && !cities.contains(city)){
            cities.add(city);
        }
        if (city.getState() == null || city.getState() != this){
            city.setState(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(name, state.name) && Objects.equals(code, state.code) && Objects.equals(country, state.country) && Objects.equals(cities, state.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, country, cities);
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", country=" + country +
                '}';
    }
}
