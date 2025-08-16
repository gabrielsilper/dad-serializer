package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.City;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeCity {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("cities.dat");

        try (ObjectInputStream cityDeserializer = new ObjectInputStream(file)) {
            while (true) {
                try {
                    City city = (City) cityDeserializer.readObject();
                    System.out.println(city);
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }
}
