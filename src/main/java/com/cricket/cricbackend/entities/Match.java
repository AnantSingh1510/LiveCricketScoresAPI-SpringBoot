package com.cricket.cricbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cric_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private String matchHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlingTeam;
    private String bowlingTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();

    public void setMatchStatus(){
        if(this.textComplete.trim().isBlank())
            this.status = MatchStatus.LIVE;
        else
            this.status = MatchStatus.COMPLETED;
    }
}
