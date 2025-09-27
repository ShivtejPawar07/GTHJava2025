package com.tot;

public class Team {

    private Player[] p;

    // Accept variable number of Player objects
    public void acceptPlayer(Player... p) {
        this.p = p;
    }

    // Show player with maximum score
    public void showMax() {
        if (p == null || p.length == 0) {
            System.out.println("No players available.");
            return;
        }

        int maxIndex = 0; // store index of player with max score

        for (int i = 1; i < p.length; i++) { // start from 1
            if (p[i].getScore() > p[maxIndex].getScore()) {
                maxIndex = i;
            }
        }

        System.out.println("\nPlayer with Maximum Score:");
        System.out.println("Name\tScore");
        System.out.println(p[maxIndex].getName() + "\t" + p[maxIndex].getScore());
    }
}
