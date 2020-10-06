package com.car.rent.domein;

import com.car.rent.valueobject.AutoId;
import com.car.rent.valueobject.AutoType;
import com.car.rent.valueobject.Prijs;

public class Auto {
    private final AutoId autoId;
    private final AutoType autoType;
    private final Prijs aanschafPrijs;
    private Prijs dagPrijs;

    public Auto(AutoType autoType, Prijs aanschafPrijs, Prijs dagPrijs) {
        this.autoId = new AutoId();
        this.autoType = autoType;
        this.aanschafPrijs = aanschafPrijs;
        this.dagPrijs = dagPrijs;
    }

    public AutoId getAutoId() {
        return autoId;
    }

    public AutoType getAutoType() {
        return autoType;
    }

    public Prijs getAanschafPrijs() {
        return aanschafPrijs;
    }

    public Prijs getDagPrijs() {
        return dagPrijs;
    }

    public void setDagPrijs(Prijs dagPrijs) {
        this.dagPrijs = dagPrijs;
    }
}
