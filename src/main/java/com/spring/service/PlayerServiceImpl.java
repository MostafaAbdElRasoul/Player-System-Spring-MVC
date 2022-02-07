package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PlayerDAO;
import com.spring.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	private PlayerDAO playerDao;
	
	@Autowired
	public PlayerServiceImpl(PlayerDAO playerdao) {
		this.playerDao = playerdao;
	}

	@Override
	public List<Player> allPlayers() {
		return playerDao.getPlayers();
	}

}
