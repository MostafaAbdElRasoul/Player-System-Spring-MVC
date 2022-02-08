package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String savePgae(Model model) {
		model.addAttribute("player",new Player());
		return "addPlayer";
	}
	
	//http://localhost:8082/Player/kora/savePlayer
	@PostMapping("/savePlayer")
	public String addPlayer(@ModelAttribute("player") Player player) {
		playerService.savePlayer(player);
		return "redirect:/kora/players";
	}
	
	//http://localhost:8082/Player/kora/showPlayer
	@GetMapping("/showPlayer")
	public String showPlayer(@RequestParam("playerId")int id, Model model) {
		Player player = playerService.showPlayer(id);
		model.addAttribute("player", player);
		return "addPlayer";
	}
	
	//http://localhost:8082/Player/kora/deletePlayer
	@GetMapping("/deletePlayer")
	public String deletePlayer(@RequestParam("playerId")int id) {
		playerService.deletePlayer(id);
		return "redirect:/kora/players";
	}
}
