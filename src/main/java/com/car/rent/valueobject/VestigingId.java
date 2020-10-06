package com.car.rent.valueobject;

import java.util.Objects;

public class VestigingId {
    private static int generatedId = 1;
    final int id;

    public VestigingId() {
        this.id = generatedId;
        generatedId++;
    }

    public VestigingId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof VestigingId) {
            VestigingId other = (VestigingId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}
