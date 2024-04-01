package com.cricket.cricbackend.services;

import com.cricket.cricbackend.entities.Match;

import java.util.List;

public interface CricketService {

    List<Match> getLiveMatchScores();
    List<List<String>> getPointTable();

    List<Match> getALlMatches();
}
