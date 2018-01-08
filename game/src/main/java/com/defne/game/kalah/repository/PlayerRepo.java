package com.defne.game.kalah.repository;
/*
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
*/
import com.defne.game.kalah.model.Player;

import java.util.List;
/**
 * 
 * @author DFB on 07.01.2017
 * @deprecated
 * @summary dynamodb connection is phase 2 conf deleted from project
 *
 */
//TODO: extends CrudRepository<Player, String>
//@EnableScan
public interface PlayerRepo  {
    List<Player> findById(String id);
    
}
