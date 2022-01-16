package com.ryan.DSMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.DSMovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
