/* WAP to create POJO class Player with fields id, name, and run.
   Create 5 Player objects and search player by id.
   If id found → show "Player Found"
   Else → show "Player Not Found".
*/
import java.util.*;

class Player {
    private int id;
    private String name;
    private int run;

    // Constructor
    public Player(int id, String name, int run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getRun() {
        return run;
    }
}

class Search {
    private Player[] players;

    public Search(Player[] players) {
        this.players = players;
    }

    // Search method using normal for loop
    public void foundPlayer(int skey) {
        boolean found = false;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getId() == skey) {
                System.out.println("Player found: " + players[i].getName() + " with runs " + players[i].getRun());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Player not found");
        }
    }
}

public class Cplayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of 5 players
        Player[] arr = new Player[5];
        arr[0] = new Player(1, "Shivtej", 100);
        arr[1] = new Player(2, "Rahul", 80);
        arr[2] = new Player(3, "Amit", 50);
        arr[3] = new Player(4, "Tejas", 120);
        arr[4] = new Player(5, "Rohan", 90);

        // Create search object
        Search s = new Search(arr);

        System.out.print("Enter the player id to search: ");
        int skey = sc.nextInt();

        s.foundPlayer(skey);
    }
}
