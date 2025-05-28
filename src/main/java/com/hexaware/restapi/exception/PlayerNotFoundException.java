package com.hexaware.restapi.exception;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PlayerNotFoundException extends RuntimeException {
	public PlayerNotFoundException(String message) {
        super(message);
    }
		

 }

