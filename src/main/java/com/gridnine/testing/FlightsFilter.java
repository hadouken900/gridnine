package com.gridnine.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightsFilter {

    private List<Flight> flights;

    public FlightsFilter(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFilteredListOfFlights(FlightsTesting... filters) {
        List<Flight> result = new ArrayList<>();
        for (FlightsTesting f : filters) {
           result= f.flightsTest(flights);
        }
        return result;
    }
}
