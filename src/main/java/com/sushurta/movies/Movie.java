package com.sushurta.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data // Sets up getters and setters for all the variables
@AllArgsConstructor // Sets up the constructor for all the variables as arguments
@NoArgsConstructor // Sets up the constructor for all the variables without taking any arguments
public class Movie {

    @Id // denotes the variable are unique
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // this will allow the database to store only the review ID and the review will be in a seperate collection
    private List<Review> reviewIds;
}

