package doctor.ex.classes;

public class Human extends Living {

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return "Человек под именем " + super.getName();
    }
}