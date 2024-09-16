package com.bcci.controller;

import com.bcci.service.IPLService;
import com.bcci.entity.Player;

public class IPLController {
    private IPLService iplService;

    public IPLController() {
        this.iplService = new IPLService();
    }

    public void addPlayer(int jerseyNo, String name, String teamName, int runs) {
        iplService.addPlayer(jerseyNo, name, teamName, runs);
    }

    public void displayAllPlayers() {
        iplService.allPlayerDetails();
    }

    public void displayCskPlayers() {
        iplService.cskPlayerDetails();
    }

    public void displayPlayersWithMoreThan5000Runs() {
        iplService.playersWithMoreThan5000Runs();
    }

    public void displayPlayerByJerseyNo(int jerseyNo) {
        Player player = iplService.getPlayerByJerseyNo(jerseyNo);
        if (player != null) {
            System.out.println(player);
        } else {
            System.out.println("Player with jersey number " + jerseyNo + " not found.");
        }
    }
}
