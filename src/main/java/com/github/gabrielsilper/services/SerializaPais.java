package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.Pais;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializaPais {
    public static void main(String[] args) throws IOException {
        List<Pais> paises = List.of(
                new Pais("Brasil", "América do Sul"),
                new Pais("Alemanha", "Europa"),
                new Pais("Japão", "Ásia")
        );

        FileOutputStream arquivo = new FileOutputStream("paises.dat");

        ObjectOutputStream paisSerializer = new ObjectOutputStream(arquivo);

        for (Pais pais : paises) {
            paisSerializer.writeObject(pais);
        }
    }
}
