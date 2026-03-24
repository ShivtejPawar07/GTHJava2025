import java.util.Scanner;

class RandomApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100); // random number between 0-99
        int userNumber = -1;

        do {
            System.out.println("Guess my number (0 to 99): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO! CORRECT NUMBER!!!");
                break;
            } 
            else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } 
            else {
                System.out.println("Your number is too small.");
            }

        } while (userNumber >= 0);

        System.out.println("My Number was: " + myNumber);
        sc.close();
    }
}