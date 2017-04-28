package com.exampleData;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by enrique on 28/04/17.
 */

//@RepositoryRestResource(collectionResourceRel = "airport", path = "airport")
@Repository
public interface AirportRepository extends MongoRepository<Airport, String>{

    List<Airport> findByCity(@Param("city") String city);
    List<Airport> findByIata(@Param("iata") String iata);
    List<Airport> findByCityAndIata(@Param("city") String city, @Param("iata") String iata);

    List<Airport> findByIataLike(@Param("iata") String iata);
    //List<Airport> findByCityLikeOrIataLikeIgnoreCase(@Param("city") String city);
    List<Airport> findByCityLikeAndIataLikeIgnoreCase(@Param("city") String city, @Param("iata") String iata);

    List<Airport> findAirportByCityOrIataLike(@Param("city") String city, @Param("iata") String iata);

}
