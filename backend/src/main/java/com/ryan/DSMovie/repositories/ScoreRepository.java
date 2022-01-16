package com.ryan.DSMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.DSMovie.entities.Score;
import com.ryan.DSMovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
