package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

public class WrongDepartureArrivingTimeFlightTesting implements FlightsTesting{

    @Override
    public List<Flight> flightsTest(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }
}
