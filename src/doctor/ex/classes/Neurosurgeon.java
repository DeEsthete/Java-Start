package doctor.ex.classes;

import java.util.Random;

public class Neurosurgeon <T extends Living> extends Surgeon<T> {
    @Override
    public boolean doOperation(T living) {
        System.out.println("Делаю операцию на мозге " + living.getName());
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void quit() {
        System.out.println("Уволился как полагается нейрохирургу");
    }
}