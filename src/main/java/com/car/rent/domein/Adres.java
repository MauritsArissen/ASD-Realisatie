package com.car.rent.domein;

import com.car.rent.valueobject.AdresId;

public class Adres {
    private final AdresId adresId;
    private String stad;
    private String postcode;
    private int huisnummer;

    public Adres(AdresId adresid, String stad, String postcode, int huisnummer) {
        this.adresId = adresid;
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
