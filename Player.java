package com.bcci.entity;

public class Player {
	private int jerseyNo;
	private int runs;
	private String name;
	private String teamName;

	// Constructor to initialize player details
	public Player(int jerseyNo, String name, String teamName, int runs) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.teamName = teamName;
		this.runs = runs;
	}

	// Getters for accessing the attributes
	public int getJerseyNo() {
		return jerseyNo;
	}

	public String getName() {
		return name;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getRuns() {
		return runs;
	}

	// Overriding toString() to display player details
	@Override
	public String toString() {
		return "Player [Jersey No=" + jerseyNo + ", Name=" + name + ", Team="
				+ teamName + ", Runs=" + runs + "]";
	}
}
