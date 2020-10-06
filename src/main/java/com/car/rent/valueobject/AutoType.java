package com.car.rent.valueobject;

public class AutoType {
    private final String merk;
    private final String model;

    public AutoType(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s %s", merk, model);
    }
}
