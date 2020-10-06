package com.car.rent.valueobject;

import java.util.Objects;

public class BetalingId {
    private static int generatedId = 1;
    final int id;

    public BetalingId() {
        this.id = generatedId;
        generatedId++;
    }

    public BetalingId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof BetalingId) {
            BetalingId other = (BetalingId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}