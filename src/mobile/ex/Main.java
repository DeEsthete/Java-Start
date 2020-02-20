package mobile.ex;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("J5", 12000, (byte)5, (byte)7, 4200, "Samsung", new Date(1212121313131L));
        System.out.println(mobile);
    }
}