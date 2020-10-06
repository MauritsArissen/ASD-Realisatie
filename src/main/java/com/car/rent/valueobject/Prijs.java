package com.car.rent.valueobject;

import com.car.rent.enumeration.Valuta;

public class Prijs {
    final double prijs;
    final Valuta valuta;

    public Prijs(double prijs, Valuta valuta) {
        this.prijs = prijs;
        this.valuta = valuta;
    }

    public double getPrijs() {
        return prijs;
    }

    public Valuta getValuta() {
        return valuta;
    }

    @Override
    public String toString() {
        return String.format("%c%.2f", valuta.getTeken(), prijs);
    }
}