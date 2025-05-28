package com.hexaware.restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restapi.entity.Player;
import com.hexaware.restapi.service.PlayerServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

	    @Autowired
	    private PlayerServiceImpl service;

	    @GetMapping
	    public List<Player> getAll() {
	        return service.getAllPlayers();
	    }

	    @GetMapping("/{id}")
	    public Player getById(@PathVariable int id) {
	        return service.getPlayerById(id);
	    }

	    @PostMapping("/add")
	    public ResponseEntity<Player> create(@Valid @RequestBody Player player) {
	        return new ResponseEntity<>(service.createPlayer(player), HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public Player update(@PathVariable int id, @Valid @RequestBody Player player) {
	        return service.updatePlayer(id, player);
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> delete(@PathVariable int id) {
	        service.deletePlayer(id);
	        return ResponseEntity.noContent().build();
	    }

}


