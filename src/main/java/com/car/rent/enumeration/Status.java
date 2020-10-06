package com.car.rent.enumeration;

public enum Status {
    INBEHANDELING(101, "In behandeling"),
    GEHONOREERD(102, "Gehonoreerd"),
    AFGEHANDELD(103, "Afgehandeld"),
    GEANNULEERD(104, "Geannuleerd");

    private final int code;
    private final String naam;

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