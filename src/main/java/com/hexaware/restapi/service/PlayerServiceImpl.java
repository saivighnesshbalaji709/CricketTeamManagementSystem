package com.hexaware.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restapi.DTO.PlayerDTO;
import com.hexaware.restapi.entity.Player;
import com.hexaware.restapi.exception.PlayerNotFoundException;
import com.hexaware.restapi.repository.PlayerRepository;

@Service
public class PlayerServiceImpl {
	

	@Autowired
    private PlayerRepository repo;
	
	public List<Player> getPlayersWithMoreMatchesThan(String playerName) {
	    return repo.findPlayersWithMoreMatchesThan(playerName);
	} //to show players who played more matches than the given player



    public List<PlayerDTO> getAllPlayers() {
        return repo.getAllPlayers();
    }

    public Player getPlayerById(int id) {
        return repo.findById(id).orElseThrow(() -> new PlayerNotFoundException("No player found with the following id "+id));
    }

    public Player createPlayer(Player player) {
        return repo.save(player);
    }

 
    public Player updatePlayer(int id, Player updatedPlayer) {
        Player p = getPlayerById(id);
        p.setPlayerName(updatedPlayer.getPlayerName());
        p.setJerseyNumber(updatedPlayer.getJerseyNumber());
        p.setRole(updatedPlayer.getRole());
        p.setTotalMatches(updatedPlayer.getTotalMatches());
        p.setTeamName(updatedPlayer.getTeamName());
        p.setCountry(updatedPlayer.getCountry());
        p.setDescription(updatedPlayer.getDescription());
        return repo.save(p);
    }

    public void deletePlayer(int id) {
        repo.deleteById(id);
    }
}
