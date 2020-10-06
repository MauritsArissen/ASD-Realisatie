package com.car.rent.valueobject;

import java.util.Objects;

public class MedewerkerId {
    private static int generatedId = 1;
    final int id;

    public MedewerkerId() {
        this.id = generatedId;
        generatedId++;
    }

    public MedewerkerId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof MedewerkerId) {
            MedewerkerId other = (MedewerkerId) o;
            return Objects.equals(id, other.id);
        } else {
            return false;
        }
    }
}