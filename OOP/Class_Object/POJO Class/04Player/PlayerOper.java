package com.tot;

public class PlayerOper {
    Player[] p;

    // Accept players
    public void accept(Player... p) {
        this.p = p;
    }

    // Calculate and display average for each player
    public void avg() {
        System.out.println("Player Details and Averages:");
        for (int i = 0; i < p.length; i++) {
            float average = (float) p[i].getRuns() / p[i].getMatches();
            System.out.println("ID: " + p[i].getPlayerId());
            System.out.println("Name: " + p[i].getName());
            System.out.println("Runs: " + p[i].getRuns());
            System.out.println("Matches: " + p[i].getMatches());
            System.out.println("Average: " + average);
            System.out.println("----------------------");
        }
    }

    // Find and display the player with the highest batting average
    public void bestAverage() {
        Player bestPlayer = null;
        float maxAvg = 0;
        for (Player player : p) {
            float avg = (float) player.getRuns() / player.getMatches();
            if (avg > maxAvg) {
                maxAvg = avg;
                bestPlayer = player;
            }
        }

        if (bestPlayer != null) {
            System.out.println("Player with Highest Average:");
            System.out.println("ID: " + bestPlayer.getPlayerId());
            System.out.println("Name: " + bestPlayer.getName());
            System.out.println("Runs: " + bestPlayer.getRuns());
            System.out.println("Matches: " + bestPlayer.getMatches());
            System.out.println("Average: " + maxAvg);
            System.out.println("----------------------");
        }
    }

    // Display players above team average
    public void aboveTeamAverage() {
        float totalAvg = 0;
        for (Player player : p) {
            totalAvg += (float) player.getRuns() / player.getMatches();
        }
        float teamAvg = totalAvg / p.length;

        System.out.println("Team Average: " + teamAvg);
        System.out.println("Players above team average:");
        for (Player player : p) {
            float avg = (float) player.getRuns() / player.getMatches();
            if (avg > teamAvg) {
                System.out.println("ID: " + player.getPlayerId());
                System.out.println("Name: " + player.getName());
                System.out.println("Runs: " + player.getRuns());
                System.out.println("Matches: " + player.getMatches());
                System.out.println("Average: " + avg);
                System.out.println("----------------------");
            }
        }
    }
}
