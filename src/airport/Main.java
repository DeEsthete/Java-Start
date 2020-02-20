package airport;

import airport.classes.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        System.out.println("By destination");
        Arrays.stream(airport.getAirlineByDestination("NY")).forEach(a -> System.out.println(a));
        System.out.println("By week day");
        Arrays.stream(airport.getAirlinesByWeekDay("Пт")).forEach(a -> System.out.println(a));
        System.out.println("By departure time");
        Arrays.stream(airport.getAirlinesByDepartureTime("Пт", new Date(1212121313131L))).forEach(a -> System.out.println(a));
    }
}