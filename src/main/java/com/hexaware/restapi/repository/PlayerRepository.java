package com.hexaware.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hexaware.restapi.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	@Query(value = "select playerid,name,jersey_number,role from player", nativeQuery = true)
	public  List<Player>  getAllPlayers();
	
}
