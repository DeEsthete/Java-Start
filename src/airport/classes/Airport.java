package airport.classes;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Airport {
    private Airline[] airlines;

    public Airport() {
        Airline airline1 = new Airline(0, 0, new Location(0, new Position(0, 10, 10), "New York", "NY"), new AirplaneType(0, "Boing-12", "B-12"), new Date(1212121212121L));
        Airline airline2 = new Airline(1, 1, new Location(1, new Position(1, 20, 20), "Amsterdam", "AMR"), new AirplaneType(1, "Boing-28", "B-28"), new Date(1212121313131L));
        Airline airline3 = new Airline(2, 2, new Location(2, new Position(2, 40, 40), "Moscow", "MSC"), new AirplaneType(2, "Boing-45", "B-45"), new Date(1213131313141L));
        Airline airline4 = new Airline(3, 3, new Location(3, new Position(3, 80, 80), "Saint-Petersburg", "SPB"), new AirplaneType(2, "Boing-46", "B-46"), new Date(1213131314151L));
        airlines = new Airline[]{airline1, airline2, airline3, airline4};
    }

    public Object[] getAirlineByDestination(String code) {
        return Arrays.stream(airlines).filter(a -> a.getDestination().getCode().equals(code)).toArray();
    }

    public Object[] getAirlinesByWeekDay(String day) {
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
        return Arrays.stream(airlines)
                .filter(a -> simpleDateformat.format(a.getDepartureTime()).equals(day))
                .toArray();
    }

    public Object[] getAirlinesByDepartureTime(String day, Date departureTime) {
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
        return Arrays.stream(airlines)
                .filter(a -> simpleDateformat.format(a.getDepartureTime()).equals(day))
                .filter(a -> a.getDepartureTime().getTime() < departureTime.getTime())
                .toArray();
    }
}