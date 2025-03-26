package com.itson.model;

public enum Habitat {
    TERRESTRE("terrestre"),
    ACUATICO("acuatico"),
    AEREO("aereo");

    private final String tipo;

    Habitat(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo: " + tipo;
    }
}
