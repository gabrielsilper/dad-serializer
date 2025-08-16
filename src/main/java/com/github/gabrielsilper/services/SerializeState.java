package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.State;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeState {
    public static List<State> states = List.of(
            new State("Amazonas", "AM", SerializeCountry.countries.getFirst()),
            new State("Santa Catarina", "SC", SerializeCountry.countries.getFirst())
    );

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("states.dat");

        try (ObjectOutputStream stateSerializer = new ObjectOutputStream(file)) {
            for (State state : states) {
                stateSerializer.writeObject(state);
            }
        }
    }
}
