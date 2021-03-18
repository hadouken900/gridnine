package com.gridnine.testing;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TimeOnTheGroundMoreThanTwoHoursFlightTesting implements FlightsTesting{
    @Override
    public List<Flight> flightsTest(List<Flight> flights) {
        List<Flight> resultList = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            List<Segment> segments = flights.get(i).getSegments();
            if (segments.size() > 1) {
                long sum = 0;
                for (int j = 1; j < segments.size(); j++) {
                    sum += ChronoUnit.MINUTES.between(segments.get(j-1).getArrivalDate(), segments.get(j).getDepartureDate());
                }
                if (sum >= 120) {
                    resultList.add(flights.get(i));
                }
            }
        }
        return resultList;
    }
}
