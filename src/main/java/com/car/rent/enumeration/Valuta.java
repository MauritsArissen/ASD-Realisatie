package com.car.rent.enumeration;

public enum Valuta {
    EURO("Euro", '€'),
    DOLLAR("Dollar", '$'),
    POUNDS("Pounds", '£');

    private final String naam;
    private final char teken;

    Valuta(String naam, char teken) {
        this.naam = naam;
        this.teken = teken;
    }

    public String getNaam() {
        return naam;
    }
    public char getTeken() {
        return teken;
    }
}