package com.hexaware.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table (name="player_table")
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int playerID;
	@Column(name="Name")
	private String playerName;
	private int jerseyNumber;
	
	@Pattern(
    regexp = "batsman|all rounder|keeper|bowler")
	private String role;
	private int totalMatches;
	private String teamName;
	@Column(name="Playing for")
	private String country;
	private String description;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerID, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
			String country, String description) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.description = description;
	}
	
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
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role+ "]";
	}
}
