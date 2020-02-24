package printer.dz.classes;

import tourism.classes.*;

import java.util.Random;

public class Printer <T extends Material> extends Entity implements PrintingDevice<T> {

    @Override
    public int doPrint(T material) {
        Random random = new Random();
        System.out.println("Обычный принтер печатает");
        material.acceptPaint();
        return random.nextInt(10);
    }
}