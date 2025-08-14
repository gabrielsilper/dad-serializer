package com.github.gabrielsilper.services;

import com.github.gabrielsilper.models.Pais;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializaPais {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream("paises.dat");

        ObjectInputStream paisDeserializer = new ObjectInputStream(arquivo);

        while (true) {
            try {
                Pais pais = (Pais) paisDeserializer.readObject();
                System.out.println(pais.getNome());
                System.out.println(pais.getContinente());
            } catch (EOFException e) {
                break;
            }
        }
    }
}
