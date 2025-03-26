package com.itson.model;

public enum Tamanio {
    PEQUENIO("pequenio"),
    MEDIANO("mediano"),
    GRANDE("grande");

    private final String estado;

    Tamanio(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "estado: " + estado;
    }
}
