package printer.dz.classes;

public class Entity {
    private int id;
    private static int index = 0;

    public Entity() {
        id = index++;
    }

    public int getId() {
        return id;
    }
}