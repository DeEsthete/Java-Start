package doctor.ex;

import doctor.ex.classes.*;

public class Main {
    public static void main(String[] args) {
        Doctor<Animal> doctor1 = new Neurosurgeon<Animal>();
        Doctor<Human> doctor2 = new Surgeon<Human>();
        doctor1.doOperation(new Animal("Murzik", 7));
        doctor2.doOperation(new Human("Lhea", 18));
        doctor1.quit();
        doctor2.quit();
    }
}