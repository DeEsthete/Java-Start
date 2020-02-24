package printer.dz.classes;

import java.util.Random;

public class Wood extends Material {
    public Wood(int quality) {
        super(quality);
    }

    @Override
    public void acceptPaint() {
        Random random = new Random();
        System.out.println("Дерево приняло краску на " + random.nextInt(getQuality()));
    }
}