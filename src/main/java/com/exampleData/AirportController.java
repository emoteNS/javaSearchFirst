package com.exampleData;

import com.exampleData.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by enrique on 28/04/17.
 */
@RestController
public class AirportController {

    @Autowired
    AirportRepository airportRepository;

    @RequestMapping("/search")
    public List<Airport> search(@Param("query") String query){

        return airportRepository.findByCityIgnoreCaseRegex(query);
    }

    @RequestMapping("/api/airports")
    public Response searchAirport(@Param("pattern") String pattern, @Param("key") String key){

        return Response.getResponseInstance(
                200,
                "",
                airportRepository.findDistinctAirportByCityOrIataLike(pattern, pattern));

    }
}
