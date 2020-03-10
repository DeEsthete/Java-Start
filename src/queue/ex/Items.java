package queue.ex;

import java.util.Arrays;
import java.util.Random;

public enum Items {
    APPLE(150),
    BANANA(130),
    Milk(350),
    CHEESE(5001);

    private final int price;

    private Items(int levelCode) {
        this.price = levelCode;
    }

    public int getPrice() {
        return price;
    }

    public static Items getRandom() {
        Random random = new Random();
        return Arrays.asList(Items.values()).get(random.nextInt(Items.values().length));
    }
}