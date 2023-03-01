package com.example.springjpa.Controller;

import com.example.springjpa.Service.MovieService;
import com.example.springjpa.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MovieController {
@Autowired
    MovieService movieService;
    @GetMapping("/get_allmovies")
    public List<Movie> getallmovies(){
return  movieService.getallmovies();
}
    @PostMapping("/add_movie")
    public void addmovie(@RequestBody () Movie movie){
movieService.addmovie(movie);
    }
}
