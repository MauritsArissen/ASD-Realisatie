package com.car.rent.valueobject;

import java.util.Objects;

public class AdresId {
    private static int generatedId = 1;
    final int id;

    public AdresId() {
        this.id = generatedId;
        generatedId++;
    }

    public AdresId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof AdresId) {
            AdresId other = (AdresId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}