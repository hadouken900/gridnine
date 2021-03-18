package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightsFilter filter = new FlightsFilter(flights);
        List<Flight> alreadyDeparturedFlightsExcluded = filter.getFilteredListOfFlights(new AlreadyDepartedFlightsTesting());
        List<Flight> wrondDepAndArrTimeFlightsExcluded = filter.getFilteredListOfFlights(new WrongDepartureArrivingTimeFlightTesting());
        List<Flight> twoHoursOnTheGroundFlightsExcluded = filter.getFilteredListOfFlights(new TimeOnTheGroundMoreThanTwoHoursFlightTesting());


        System.out.println("\nAlready departured flights excluded:");
        for (Flight f : alreadyDeparturedFlightsExcluded) {
            System.out.println(f);
        }
        System.out.println("\nFlights with wrong departured and arrived time excluded:");
        for (Flight f : wrondDepAndArrTimeFlightsExcluded) {
            System.out.println(f);
        }
        System.out.println("\nFlights with total time on the ground more then 2 hours excluded:");
        for (Flight f : twoHoursOnTheGroundFlightsExcluded) {
            System.out.println(f);
        }
    }
}
