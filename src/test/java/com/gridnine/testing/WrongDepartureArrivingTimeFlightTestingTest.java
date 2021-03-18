package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WrongDepartureArrivingTimeFlightTestingTest {

    private final WrongDepartureArrivingTimeFlightTesting testing = new WrongDepartureArrivingTimeFlightTesting();
    private final List<Flight> flights = FlightBuilder.createFlights();

    @Test
    void flightsTest() {
        assertEquals(1, testing.flightsTest(flights).size());
    }
}