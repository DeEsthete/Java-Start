package mus.piano.classes;

import mus.piano.interfaces.IPushed;

public class Key implements IPushed {
    private int id;
    private String code;

    public Key(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void push() {
        System.out.println("Key " + code + " pushed");
    }
}