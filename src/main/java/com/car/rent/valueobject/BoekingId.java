package com.car.rent.valueobject;

import java.util.Objects;

public class BoekingId {
    private static int generatedId = 1;
    final int id;

    public BoekingId() {
        this.id = generatedId;
        generatedId++;
    }

    public BoekingId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof BoekingId) {
            BoekingId other = (BoekingId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}