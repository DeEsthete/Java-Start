package tourism.classes;

public class Voucher extends Entity {
    private String name;
    private Location location;
    private TourismType type;
    private int price;

    public Voucher() {
    }

    public Voucher(String name, Location location, TourismType type, int price) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public TourismType getType() {
        return type;
    }

    public void setType(TourismType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}