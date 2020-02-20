package com.domain;

public enum Season {
    WINTER("11"),
    SPRING("22"),
    SUMMER("33"),
    AUTUMN("44");

    private String property;

    Season(String prop) {
        property = prop;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}