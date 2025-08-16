package com.github.gabrielsilper.models;

public class City {
    private String name;
    private String code;
    private State state;

    public City() {
    }

    public City(String name, String code, State state) {
        this.name = name;
        this.code = code;
        this.state = state;
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
                ", code='" + code + '\'' +
                ", state=" + state +
                '}';
    }
}
