package tourism.classes;

public class Location extends Entity {
    private String name;
    private String code;
    private int xPosition;
    private int yPosition;

    public Location() {
    }

    public Location(String name, String code, int xPosition, int yPosition) {
        this.name = name;
        this.code = code;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}