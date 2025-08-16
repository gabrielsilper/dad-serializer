package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.Country;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeCountry {
    public static List<Country> countries = List.of(
            new Country("Brasil", "América do Sul")
    );

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("countries.dat");

        try (ObjectOutputStream countrySerializer = new ObjectOutputStream(file)) {
            for (Country country : countries) {
                countrySerializer.writeObject(country);
            }
        }
    }
}
