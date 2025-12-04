/*Q3. Library Fine Calculation – Interface with Rules
Interface: FineCalculator
Method:
calculateFine(int daysLate)
Implementing Classes:
Book
Fine = ₹2 × daysLate
Magazin
Fine = ₹3 × daysLate
ResearchPaper
Fine = ₹5 × daysLate
If daysLate > 10 → add extra ₹50
Task:
Accept 8 items (mix of all types).
Calculate fine and print details.
Find total fine collected.
Explanation:
Covers:
Interface method overriding
Logical conditions inside implementing classes
Summation of results
Mixing different classes via interface reference
*/

import java.util.Scanner;

interface FineCalculator {
    int calculateFine(int daysLate);
}

class Book implements FineCalculator {
    public int calculateFine(int daysLate) {
        int fine = 2 * daysLate;
        if (daysLate > 10) fine += 50;
        return fine;
    }
}

class Magazin implements FineCalculator {
    public int calculateFine(int daysLate) {
        int fine = 3 * daysLate;
        if (daysLate > 10) fine += 50;
        return fine;
    }
}

class ResearchPaper implements FineCalculator {
    public int calculateFine(int daysLate) {
        int fine = 5 * daysLate;
        if (daysLate > 10) fine += 50;
        return fine;
    }
}

public class LibraryFineCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FineCalculator[] items = new FineCalculator[8];
        int totalFine = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter type of item (Book/Magazin/ResearchPaper):");
            String type = sc.next();
            System.out.println("Enter days late:");
            int daysLate = sc.nextInt();

            switch (type.toLowerCase()) {
                case "book":
                    items[i] = new Book();
                    break;
                case "magazin":
                    items[i] = new Magazin();
                    break;
                case "researchpaper":
                    items[i] = new ResearchPaper();
                    break;
                default:
                    System.out.println("Invalid type, defaulting to Book");
                    items[i] = new Book();
            }

            int fine = items[i].calculateFine(daysLate);
            totalFine += fine;
            System.out.println("Fine for item " + (i + 1) + ": ₹" + fine);
        }

        System.out.println("Total fine collected: ₹" + totalFine);
        sc.close();
    }
}
