package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PlayerDAO;
import com.spring.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerDAO playerDao;
	
	@Override
	@Transactional
	public List<Player> allPlayers() {
		return playerDao.getPlayers();
	}

	@Override
	@Transactional
	public void savePlayer(Player player) {
		playerDao.addPlayer(player);
	}


}
