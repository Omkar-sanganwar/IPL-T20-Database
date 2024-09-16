package com.bcci.dao;

import com.bcci.entity.Player;
import java.util.HashMap;
import java.util.Map;

public class PlayerDao {
    private Map<Integer, Player> playerMap = new HashMap<>();

    public void addPlayer(Player player) {
        playerMap.put(player.getJerseyNo(), player); // Using jersey number as the key
    }

    public Map<Integer, Player> getAllPlayers() {
        return playerMap;
    }

    public Player getPlayerByJerseyNo(int jerseyNo) {
        return playerMap.get(jerseyNo); // Get player by jersey number
    }
}
