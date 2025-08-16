package com.github.gabrielsilper.models;

import java.io.Serial;
import java.io.Serializable;

public class State implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String code;
    private Country country;

    public State() {
    }

    public State(String name, String code, Country country) {
        this.name = name;
        this.code = code;
        this.country = country;
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
