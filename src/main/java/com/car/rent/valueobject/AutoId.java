package com.car.rent.valueobject;

import java.util.Objects;

public class AutoId {
    private static int generatedId = 1;
    final int id;

    public AutoId() {
        this.id = generatedId;
        generatedId++;
    }

    public AutoId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof AutoId) {
            AutoId other = (AutoId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}