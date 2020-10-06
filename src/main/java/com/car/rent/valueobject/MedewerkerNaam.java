package com.car.rent.valueobject;

public class MedewerkerNaam {
    final String voornaam;
    final String achternaam;

    public MedewerkerNaam(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    @Override
    public String toString() {
        return String.format("%s %s", voornaam, achternaam);
    }
}
