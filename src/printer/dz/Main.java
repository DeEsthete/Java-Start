package printer.dz;

import printer.dz.classes.*;

public class Main {
    public static void main(String[] args) {
        PrintingDevice<Wood> printer1 = new LaserPrinter<Wood>();
        PrintingDevice<Cotton> printer2 = new Printer<Cotton>();
        System.out.println("Принтер работал с качеством " + printer1.doPrint(new Wood(80)));
        System.out.println("Принтер работал с качеством " + printer2.doPrint(new Cotton(60)));
    }
}