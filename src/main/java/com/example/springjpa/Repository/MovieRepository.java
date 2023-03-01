package com.example.springjpa.Repository;

import com.example.springjpa.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String>{

}
