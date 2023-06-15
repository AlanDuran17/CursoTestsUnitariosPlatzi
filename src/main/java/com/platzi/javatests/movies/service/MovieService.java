package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        Collection<Movie> allMovies = movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre). collect(Collectors.toList());

        return allMovies;
    }

    public Collection<Movie> findMoviesByDuration(int duration) {
        Collection<Movie> allMovies = movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() == duration). collect(Collectors.toList());

        return allMovies;
    }

    public Collection<Movie> findMoviesByTemplate(Movie template) {
        Collection<Movie> allMovies = movieRepository.findAll().stream()
                .filter((movie) -> {
                    boolean valueToReturn = false;
                    if(template!= null){
                        if (template.getMinutes() >= 0) {
                            valueToReturn =
                                    (template.getName() != null ? movie.getName().equals(template.getName()) : true) &&
                                    (template.getMinutes() != null ? movie.getMinutes() <= template.getMinutes() : true) &&
                                    (template.getGenre() != null ? movie.getGenre() == template.getGenre() : true);
                        } else {
                            throw new IllegalArgumentException("No puedes usar numeros negativos");
                        }
                    }
                    return valueToReturn;
                }).collect(Collectors.toList());
        return allMovies;
    }

}
