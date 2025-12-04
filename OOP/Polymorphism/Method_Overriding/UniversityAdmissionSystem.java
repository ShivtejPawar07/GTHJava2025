/*University Admission System – Priority Ranking
Base class: Applicant
Fields: name, score
Method: getRankScore() → returns score directly
Child classes:
SportsQuota: adds +15 to score
DefenseQuota: adds +10 to score
General: no extra
NRIQuota: +20 but fee is 3× normal
Task:
Take 12 applicants (mix of all categories).
Override getRankScore() in each child.
Sort applicants by rank score (high to low).
Print top 3 shortlisted candidates.
Concepts
Overriding
Sorting array of objects
Multiple child classes
Priority logic
*/

import java.util.*;

class Applicant {
    String name;
    int score;

    Applicant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    int getRankScore() {
        return score;
    }
}

class SportsQuota extends Applicant {
    SportsQuota(String name, int score) {
        super(name, score);
    }

    @Override
    int getRankScore() {
        return score + 15;
    }
}

class DefenseQuota extends Applicant {
    DefenseQuota(String name, int score) {
        super(name, score);
    }

    @Override
    int getRankScore() {
        return score + 10;
    }
}

class General extends Applicant {
    General(String name, int score) {
        super(name, score);
    }

    @Override
    int getRankScore() {
        return score;
    }
}

class NRIQuota extends Applicant {
    int fee;

    NRIQuota(String name, int score) {
        super(name, score);
        this.fee = 0;   // fee not needed for rank score, but NRI fee is 3× normal
    }

    @Override
    int getRankScore() {
        return score + 20;
    }
}

public class UniversityAdmissionSystem {
    public static void main(String[] args) {

        Applicant[] a = new Applicant[12];

        a[0] = new SportsQuota("Shivtej", 100);
        a[1] = new General("Rohan", 110);
        a[2] = new NRIQuota("Aditya", 90);
        a[3] = new DefenseQuota("Pratik", 95);
        a[4] = new SportsQuota("Sanket", 85);
        a[5] = new General("Amit", 120);
        a[6] = new NRIQuota("Vivek", 80);
        a[7] = new DefenseQuota("Kunal", 88);
        a[8] = new SportsQuota("Rutuja", 97);
        a[9] = new General("Riya", 99);
        a[10] = new DefenseQuota("Shreya", 90);
        a[11] = new NRIQuota("Tejas", 92);

        // Sort using Comparator (descending by rank score)
        Arrays.sort(a, new Comparator<Applicant>() {
    public int compare(Applicant x, Applicant y) {

        if (y.getRankScore() > x.getRankScore())
            return 1;     // y should come before x

        else if (y.getRankScore() < x.getRankScore())
            return -1;    // x should come before y

        else
            return 0;     // equal
    }
});

        System.out.println("=== Top 3 Selected Applicants ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + a[i].name +
                               " → Rank Score: " + a[i].getRankScore());
        }
    }
}

