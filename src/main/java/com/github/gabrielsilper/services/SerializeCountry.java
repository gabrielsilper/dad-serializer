package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.Country;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeCountry {
    public static void main(String[] args) throws IOException {
        List<Country> countries = List.of(
                new Country("Brasil", "América do Sul"),
                new Country("Alemanha", "Europa"),
                new Country("Japão", "Ásia")
        );

        FileOutputStream file = new FileOutputStream("countries.dat");

        ObjectOutputStream serializerCountry = new ObjectOutputStream(file);

        for (Country country : countries) {
            serializerCountry.writeObject(country);
        }
    }
}
