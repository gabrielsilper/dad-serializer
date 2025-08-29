package com.github.gabrielsilper;

import com.github.gabrielsilper.utils.SerializeUtils;

import java.io.IOException;

public class DeserializeMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeUtils.deserialize("states.dat");
    }
}
