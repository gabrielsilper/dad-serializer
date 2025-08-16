package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.City;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeCity {
    private static final List<City> cities = List.of(
            new City("Manaus", SerializeState.states.getFirst()),
            new City("Florianópolis", SerializeState.states.getLast())
    );

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("cities.dat");

        try (ObjectOutputStream citySerializer = new ObjectOutputStream(file)) {
            for (City city : cities) {
                citySerializer.writeObject(city);
            }
        }
    }
}
