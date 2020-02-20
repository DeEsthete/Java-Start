package airport.classes;

public class Location {
    private int id;
    private Position position;
    private String name;
    private String code;

    public Location(int id, Position position, String name, String code) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "Id: " + id + "\n" +
                "Position: [" + position.toString() + "]\n" +
                "Name: " + name + "\n" +
                "Code: " + code + "\n";
    }
}