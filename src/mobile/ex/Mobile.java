package mobile.ex;

import java.util.Date;

public class Mobile {
    private String name;
    private long price;
    private byte frontMegapixels;
    private byte backMegapixels;
    private int batteryMah;
    private Company originCompany;

    private class Company {
        private String name;
        private Date creationDate;

        public Company() {
        }

        public Company(String name, Date creationDate) {
            this.name = name;
            this.creationDate = creationDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "name='" + name + '\'' +
                    ", creationDate=" + creationDate +
                    '}';
        }
    }

    public Mobile() {
    }

    public Mobile(String name, long price, byte frontMegapixels, byte backMegapixels, int batteryMah, String companyName, Date companyCreationDate) {
        this.name = name;
        this.price = price;
        this.frontMegapixels = frontMegapixels;
        this.backMegapixels = backMegapixels;
        this.batteryMah = batteryMah;
        this.originCompany = new Company(companyName, companyCreationDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public byte getFrontMegapixels() {
        return frontMegapixels;
    }

    public void setFrontMegapixels(byte frontMegapixels) {
        this.frontMegapixels = frontMegapixels;
    }

    public byte getBackMegapixels() {
        return backMegapixels;
    }

    public void setBackMegapixels(byte backMegapixels) {
        this.backMegapixels = backMegapixels;
    }

    public int getBatteryMah() {
        return batteryMah;
    }

    public void setBatteryMah(int batteryMah) {
        this.batteryMah = batteryMah;
    }

    public Company getOriginCompany() {
        return originCompany;
    }

    public void setOriginCompany(Company originCompany) {
        this.originCompany = originCompany;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", frontMegapixels=" + frontMegapixels +
                ", backMegapixels=" + backMegapixels +
                ", batteryMah=" + batteryMah +
                ", originCompany=" + originCompany +
                '}';
    }
}