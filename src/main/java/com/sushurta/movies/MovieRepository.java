package com.sushurta.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //just by naming the method as find by ImdbID the spring data mongodb will understand what to do
    Optional<Movie> findMovieByImdbId(String imdbId);

}
