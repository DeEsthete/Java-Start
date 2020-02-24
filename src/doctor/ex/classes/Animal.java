package doctor.ex.classes;

public class Animal extends Living {

    public Animal(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return "Животное под именем " + super.getName();
    }
}