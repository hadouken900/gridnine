package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightsFilter filter = new FlightsFilter(flights);
        List<Flight> alreadyDeparturedFlights = filter.getFilteredListOfFlights(new AlreadyDepartedFlightsTesting());
        List<Flight> wrondDepAndArrTimeFlights = filter.getFilteredListOfFlights(new WrongDepartureArrivingTimeFlightTesting());
        List<Flight> twoHoursOnTheGroundFlights = filter.getFilteredListOfFlights(new TimeOnTheGroundMoreThanTwoHoursFlightTesting());


        System.out.println("\nAlready departured flights:");
        for (Flight f : alreadyDeparturedFlights) {
            System.out.println(f);
        }
        System.out.println("\nFlights with wrong departured and arrived time:");
        for (Flight f : wrondDepAndArrTimeFlights) {
            System.out.println(f);
        }
        System.out.println("\nFlights with total time on the ground more then 2 hours:");
        for (Flight f : twoHoursOnTheGroundFlights) {
            System.out.println(f);
        }
    }
}
