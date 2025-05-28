package com.hexaware.restapi.DTO;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="player_table")
public class PlayerDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int playerID;
	@Column(name="Name")
	private String playerName;
	@NotNull
	private int jerseyNumber;
	private String role;

	
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "PlayerDTO [playerID=" + playerID + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + "]";
	}
	
}
