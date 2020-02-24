package printer.dz.classes;

public abstract class Material extends Entity {
    public int quality;

    public Material(int quality) {
        this.quality = quality;
    }

    public void acceptPaint() {
        System.out.println("Материал принял краску");
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}