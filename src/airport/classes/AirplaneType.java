package airport.classes;

public class AirplaneType {
    private int id;
    private String name;
    private String code;

    public AirplaneType(int id, String name, String code) {
        this.id = id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Code: " + code + "\n";
    }
}