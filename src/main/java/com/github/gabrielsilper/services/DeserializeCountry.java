package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.Country;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeCountry {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("countries.dat");

        ObjectInputStream countryDeserializer = new ObjectInputStream(file);

        while (true) {
            try {
                Country country = (Country) countryDeserializer.readObject();
                System.out.println(country);
            } catch (EOFException e) {
                break;
            }
        }
    }
}
