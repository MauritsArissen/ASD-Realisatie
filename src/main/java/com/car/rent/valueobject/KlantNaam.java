package com.car.rent.valueobject;

public class KlantNaam {
    final String voornaam;
    final String achternaam;

    public KlantNaam(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }
}
