package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Player;
import com.spring.service.PlayerService;


//http://localhost:8082/Player/
@Controller
@RequestMapping("/kora")
//http://localhost:8082/Player/kora
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	//http://localhost:8082/Player/kora/players
	@GetMapping("/players")
	public String players(Model model){
		List<Player> players = playerService.allPlayers();
		model.addAttribute("players", players);
		return "kora-players";
	}
	
	//http://localhost:8082/Player/kora/add
	@GetMapping("/add")
	public String savePgae() {
		return "addPlayer";
	}
	
}
