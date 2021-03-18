package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class AlreadyDepartedFlightsTesting implements FlightsTesting{

    @Override
    public List<Flight> flightsTest(List<Flight> flights) {
       return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getDepartureDate().isBefore(LocalDateTime.now())))
                .collect(Collectors.toList());
    }
}
