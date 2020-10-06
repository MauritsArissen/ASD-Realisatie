package com.car.rent.valueobject;

import java.util.Objects;

public class InkoopId {
    private static int generatedId = 1;
    final int id;

    public InkoopId() {
        this.id = generatedId;
        generatedId++;
    }

    public InkoopId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof InkoopId) {
            InkoopId other = (InkoopId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}