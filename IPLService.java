package com.bcci.service;

import com.bcci.dao.PlayerDao;
import com.bcci.entity.Player;
import java.util.Map;

public class IPLService {
    private PlayerDao playerDao;

    public IPLService() {
        this.playerDao = new PlayerDao();
    }

    public void addPlayer(int jerseyNo, String name, String teamName, int runs) {
        Player player = new Player(jerseyNo, name, teamName, runs);
        playerDao.addPlayer(player);
    }

    public void allPlayerDetails() {
        for (Map.Entry<Integer, Player> entry : playerDao.getAllPlayers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void cskPlayerDetails() {
        for (Map.Entry<Integer, Player> entry : playerDao.getAllPlayers().entrySet()) {
            if ("Chennai Super Kings".equals(entry.getValue().getTeamName())) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void playersWithMoreThan5000Runs() {
        for (Map.Entry<Integer, Player> entry : playerDao.getAllPlayers().entrySet()) {
            if (entry.getValue().getRuns() > 5000) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Method to get player by jersey number
    public Player getPlayerByJerseyNo(int jerseyNo) {
        return playerDao.getPlayerByJerseyNo(jerseyNo);
    }
}
