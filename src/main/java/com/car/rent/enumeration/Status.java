package com.car.rent.enumeration;

public enum Status {
    INBEHANDELING(101, "In behandeling"),
    AFGEHANDELD(102, "Afgehandeld"),
    GEANNULEERD(103, "Geannuleerd");

    private int code;
    private String naam;

    private Status(int code, String naam) {
        this.code = code;
        this.naam = naam;
    }

    public int getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }
}