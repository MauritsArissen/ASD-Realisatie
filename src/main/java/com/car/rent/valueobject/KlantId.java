package com.car.rent.valueobject;

import java.util.Objects;

public class KlantId {
    private static int generatedId = 1;
    final int id;

    public KlantId() {
        this.id = generatedId;
        generatedId++;
    }

    public KlantId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof KlantId) {
            KlantId other = (KlantId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}