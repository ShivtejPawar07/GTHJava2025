package player.app;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player[] p=new Player[3];
		for(int i=0;i<p.length;i++) {
			System.out.println("Enter Name Score");
			String name=sc.next();
			int score=sc.nextInt();
			
			p[i]=new Player(name,score);
		}
		 // Find player with max score
        int maxIndex = 0; // store index of max score
        for (int i = 1; i < p.length; i++) {
            if (p[i].getScore() > p[maxIndex].getScore()) {
                maxIndex = i;
            }
        }

        // Print player with max score
        System.out.println("\nPlayer with Maximum Score:");
        System.out.println("Name\tScore");
        System.out.println(p[maxIndex].getName() + "\t" + p[maxIndex].getScore());

	}

}
