package com.defne.game.kalah.repository;

import java.util.List;

//import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
//import org.springframework.data.repository.CrudRepository;

import com.defne.game.kalah.model.Match;
/**
 * 
 * @author DFB on 07.01.2017
 * @deprecated
 * @summary dynamodb connection is phase 2  dynamodb conf deleted from project
 *
 */
//TODO: extends CrudRepository<Match, String>
public interface MatchRepo  {
    List<Match> findById(String id);
    
}
