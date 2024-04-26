package com.cricket.iplinfo.repository;
import com.cricket.iplinfo.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRespository extends JpaRepository<Match,Integer> {

    Optional<Match> findByTeamHeading(Integer integer);
}
