package com.car.rent.domain;

import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.KlantId;
import com.car.rent.valueobject.KlantNaam;

public class Klant {
    private final KlantId klantId;
    private final KlantNaam klantNaam;
    private AdresId adresId;

    public Klant(KlantNaam klantNaam, AdresId adresId) {
        this.klantId = new KlantId();
        this.klantNaam = klantNaam;
        this.adresId = adresId;
    }

    public KlantId getKlantId() {
        return klantId;
    }

    public KlantNaam getKlantNaam() {
        return klantNaam;
    }

    public AdresId getAdresId() {
        return adresId;
    }

    public void setAdresId(AdresId adresId) {
        this.adresId = adresId;
    }
}
