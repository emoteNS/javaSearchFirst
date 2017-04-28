package com.exampleData;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by enrique on 28/04/17.
 */
public class AirportServiceTest {

    @Test
    public void shoulFindASingleResult(){
        AirportService airportService = null;

        Airport airport = new Airport(1, "Enrique", "Mexico", "Mexico", "MEX");
        airportService.create(airport);

        Airport result = airportService.find( "MEX" );

        Assert.assertEquals(airport.getIata(), result.getIata());
    }
}
