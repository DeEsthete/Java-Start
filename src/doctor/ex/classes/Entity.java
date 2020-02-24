package doctor.ex.classes;

public class Entity {
    private int id;
    private static int index = 0;

    public Entity() {
        id = index++;
    }

    public int getId() {
        return id;
    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
}