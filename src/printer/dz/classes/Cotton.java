package printer.dz.classes;

import java.util.Random;

public class Cotton extends Material {

    public Cotton(int quality) {
        super(quality);
    }

    @Override
    public void acceptPaint() {
        Random random = new Random();
        System.out.println("Хлопок принял краску на " + random.nextInt(getQuality()));
    }
}