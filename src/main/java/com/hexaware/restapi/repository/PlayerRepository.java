package com.hexaware.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.restapi.DTO.PlayerDTO;
import com.hexaware.restapi.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	@Query(value = "select playerid,name,jersey_number,role from player_table", nativeQuery = true)
	public  List<PlayerDTO>  getAllPlayers();
	
	@Query(value = "select * from player_table where total_matches > (select total_matches from player_table where name = 'Virat Kohli')", nativeQuery = true)
	List<Player> PlayersWithMoreMatchesThanVirat();

	
}
