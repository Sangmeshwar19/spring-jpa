package com.example.springjpa.Service;

import com.example.springjpa.Repository.MovieRepository;
import com.example.springjpa.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public List<Movie> getallmovies(){
        return   movieRepository.findAll();
    }
    public void addmovie(Movie movie){
        movieRepository.save(movie);
    }
}
