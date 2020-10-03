package com.example.demo.models.DTO;

import com.example.demo.models.FootballClub;

import java.util.List;

public class ChampiondhipDTO {
    private List<FootballClub> participants;
    private List<Integer> scores;

    public List<FootballClub> getParticipants() {
        return participants;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setParticipants(List<FootballClub> participants) {
        this.participants = participants;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }
}
