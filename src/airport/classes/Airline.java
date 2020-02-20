package airport.classes;

import java.util.Date;

public class Airline {
    private int id;
    private Location destination;
    private int flightNumber;
    private AirplaneType airplaneType;
    private Date departureTime;

    public Airline(int id, int flightNumber, Location destination, AirplaneType airplaneType, Date departureTime) {
        this.flightNumber = flightNumber;
        this.id = id;
        this.destination = destination;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String toString() {
        return "Id: " + id + "\n" +
                "Location: [" + destination.toString() + "]\n" +
                "Number: " + flightNumber + "\n" +
                "Type: [" + airplaneType.toString() + "]\n" +
                "Departure time: " + departureTime.toString() + "\n";
    }
}