package tourism.classes;

import java.util.Date;

public class Entity {
    private int id;
    private Date dateCreate;

    private static int index = 0;

    public Entity() {
        id = index++;
        dateCreate = new Date();
    }

    public int getId() {
        return id;
    }

    public Date getDateCreate() {
        return dateCreate;
    }
}