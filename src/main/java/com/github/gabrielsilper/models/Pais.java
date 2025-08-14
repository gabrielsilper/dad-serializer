package com.github.gabrielsilper.models;

import java.io.Serial;
import java.io.Serializable;

public class Pais implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String nome;
    private String continente;

    public Pais () {
    }

    public Pais (String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", continente='" + continente + '\'' +
                '}';
    }
}
