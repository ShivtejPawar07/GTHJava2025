package com.tot;

public class Player {
    // Fields
    private int playerId;
    private String name;
    private int runs;
    private int matches;

    // Constructor
    public Player(int playerId, String name, int runs, int matches) {
        this.playerId = playerId;
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    // Getter methods
    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getRuns() {
        return runs;
    }

    public int getMatches() {
        return matches;
    }
}
