package com.exampleData;

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

        //return airportRepository.findAirportByCityOrIataLike( query, query );
        //return airportRepository.findByIataLike(query);
        return airportRepository.findByCityLikeAndIataLikeIgnoreCase(query, query);
    }
}
