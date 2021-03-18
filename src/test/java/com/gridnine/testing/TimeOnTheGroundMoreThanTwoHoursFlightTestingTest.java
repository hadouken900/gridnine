package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeOnTheGroundMoreThanTwoHoursFlightTestingTest {

    private final TimeOnTheGroundMoreThanTwoHoursFlightTesting testing = new TimeOnTheGroundMoreThanTwoHoursFlightTesting();

    private final List<Flight> flights = FlightBuilder.createFlights();


    @Test
    void flightsTest() {

        assertEquals(2, testing.flightsTest(flights).size());

    }
}