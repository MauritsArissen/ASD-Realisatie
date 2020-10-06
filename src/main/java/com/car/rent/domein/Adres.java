package com.car.rent.domein;

import com.car.rent.valueobject.AdresId;

public class Adres {
    private final AdresId adresId;
    private final String stad;
    private final String postcode;
    private final int huisnummer;

    public Adres(String stad, String postcode, int huisnummer) {
        this.adresId = new AdresId();
        this.stad = stad;
        this.postcode = postcode;
        this.huisnummer = huisnummer;
    }

    public AdresId getAdresId() {
        return adresId;
    }

    public String getStad() {
        return stad;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getHuisnummer() {
        return huisnummer;
    }
}
