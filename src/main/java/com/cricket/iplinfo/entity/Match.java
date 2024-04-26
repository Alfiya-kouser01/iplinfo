package com.cricket.iplinfo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="cricket")
public class Match{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatuss status;

    private Date date=new Date();

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatuss.LIVE;
        }
        else{
            this.status=MatchStatuss.COMPLETED;
        }
    }
}
