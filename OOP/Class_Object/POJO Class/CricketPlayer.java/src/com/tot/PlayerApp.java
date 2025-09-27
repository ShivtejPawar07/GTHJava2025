package com.tot;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] p = new Player[5];
        p[0] = new Player(1, "Shivtej", 350, 10);
        p[1] = new Player(2, "Tej", 420, 12);
        p[2] = new Player(3, "Rahul", 280, 8);
        p[3] = new Player(4, "Amit", 500, 15);
        p[4] = new Player(5, "Sagar", 310, 9);

        PlayerOper po = new PlayerOper();
        po.accept(p);
        po.avg();
        po.bestAverage();
        po.aboveTeamAverage();
    }
}
