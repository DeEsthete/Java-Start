package mus.piano.classes;

import mus.piano.interfaces.IPushed;

public class Pedal implements IPushed {
    private int id;
    private String code;

    public Pedal(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void push() {
        System.out.println("Pedal " + code + " pushed");
    }
}