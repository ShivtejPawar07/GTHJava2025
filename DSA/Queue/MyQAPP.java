import java.util.*;

class MYQueue {
    private int q[] = new int[5];
    int front = 0, rear = -1;

    // INSERT
    void insert(int value) {
        if (rear == q.length - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            q[rear] = value;
            System.out.println("Inserted " + value);
        }
    }

    // DELETE
    void delete() {
        if (front > rear) {
            System.out.println("Queue is empty");
            front = 0;
            rear = -1;
        } else {
            System.out.println("Removed value " + q[front]);
            front++;
        }
    }

    // DISPLAY
    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(q[i] + "\t");
            }
            System.out.println();
        }
    }
}

public class MyQAPP {
    public static void main(String x[]) {
        MYQueue qu = new MYQueue();
        Scanner xyz = new Scanner(System.in);

        do {
            System.out.println("1:INSERT");
            System.out.println("2:DELETE");
            System.out.println("3:DISPLAY");
            System.out.println("4:EXIT");
            System.out.println("Enter your choice");

            int choice = xyz.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value in queue");
                    int value = xyz.nextInt();
                    qu.insert(value);
                    break;

                case 2:
                    qu.delete();
                    break;

                case 3:
                    qu.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }
}
