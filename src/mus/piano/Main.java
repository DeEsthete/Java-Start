package mus.piano;

import mus.piano.classes.Key;
import mus.piano.classes.Pedal;
import mus.piano.classes.Piano;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Key> keys = new ArrayList<Key>();
        for (int i = 0; i < 81; i++) {
            keys.add(new Key(i, "K" + i));
        }

        ArrayList<Pedal> pedals = new ArrayList<Pedal>();
        for (int i = 0; i < 2; i++) {
            pedals.add(new Pedal(i, "P" + i));
        }
        Piano piano = new Piano("piano1", keys.toArray(new Key[keys.size()]), pedals.toArray(new Pedal[pedals.size()]));
        System.out.println("===========================================================");
        System.out.println("Piano configuration: ");
        piano.configure();
        System.out.println("===========================================================");
        System.out.println("Piano play: ");
        piano.play();
        System.out.println("===========================================================");
        piano.playKey("K3");
        piano.playKey("K9");
        System.out.println("===========================================================");
    }
}