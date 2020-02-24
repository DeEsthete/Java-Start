package printer.dz.classes;

public class LaserPrinter <T extends Material> extends Printer<T> {
    @Override
    public int doPrint(T material) {
        System.out.println("Лазерный принтер печатает");
        material.acceptPaint();
        return 10;
    }
}