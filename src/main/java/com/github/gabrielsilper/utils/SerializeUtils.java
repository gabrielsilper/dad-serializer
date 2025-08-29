package com.github.gabrielsilper.utils;

import java.io.*;
import java.util.List;

public class SerializeUtils {

    public static <T> void serialize(T t, String fileName) throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);

        try (ObjectOutputStream serializer = new ObjectOutputStream(file)) {
            serializer.writeObject(t);
        }
    }

    public static <T> void serialize(List<T> list, String fileName) throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);

        try (ObjectOutputStream serializer = new ObjectOutputStream(file)) {
            for (T t : list) {
                serializer.writeObject(t);
            }
        }
    }

    public static void deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(fileName);

        try (ObjectInputStream deserializer = new ObjectInputStream(file)) {
            while (true) {
                try {
                    Object object = deserializer.readObject();
                    System.out.println(object);
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }
}
