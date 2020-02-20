package mus.piano.classes;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class Piano {
    private String name;
    private Key[] keys;
    private Pedal[] pedals;

    public Piano(String name, Key[] keys, Pedal[] pedals) {
        this.name = name;
        this.keys = keys;
        this.pedals = pedals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }

    public Pedal[] getPedals() {
        return pedals;
    }

    public void setPedals(Pedal[] pedals) {
        this.pedals = pedals;
    }

    public void configure() {
        System.out.println("Piano " + name + "configured");
    }

    public void play() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++){
            keys[rand.nextInt(keys.length)].push();
        }
    }

    public void playKey(String code) {
        Optional<Key> key = Arrays.stream(keys).filter(k -> k.getCode().equals(code)).findFirst();
        if (key.isPresent()) {
            key.get().push();
        }
    }
}