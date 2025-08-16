package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.State;

import java.io.*;

public class DeserializeState {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("states.dat");

        try(ObjectInputStream stateDeserializer = new ObjectInputStream(file)) {
            while (true) {
                try {
                    State state = (State) stateDeserializer.readObject();
                    System.out.println(state);
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }
}
