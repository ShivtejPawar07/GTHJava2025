/*4. Create class name as ArrayOperation with method name as setArray() and create its Two child 
classes name as CeilFloor , Matrix. We need to inherit the ArrayOperation class in CeilFloor, Matrix and 
create method. and write the logic.  
1. CeilFloor Class : -  
Expected Output : The given array is : 1 3 5 7 8 9  
Number: 0 ceiling is: 1 floor is: -1  
Number: 1 ceiling is: 1 floor is: 1  
Number: 2 ceiling is: 3 floor is: 1  
Number: 3 ceiling is: 3 floor is: 3  
Number: 4 ceiling is: 5 floor is: 3  
Number: 5 ceiling is: 5 floor is: 5  
Number: 6 ceiling is: 7 floor is: 5  
Number: 7 ceiling is: 7 floor is: 7  
Number: 8 ceiling is: 8 floor is: 8  
Number: 9 ceiling is: 9 floor is: 9  
Number: 10 ceiling is: -1 floor is: 9 
 
2. Matrix class :-  
 
Enter 9 elements for the 3x3 matrix: 10 25 40  
 50 15 20  
 30 35 45  
Expected Output :  
 Second max in column 1: 30  
 Second max in column 2: 25  
       Second max in column 3: 40 */

import java.util.Scanner;

// Parent class
class ArrayOperation {
    int[] arr;

    void setArray(int[] a) {
        arr = a;
    }
}

// Child class 1
class CeilFloor extends ArrayOperation {

    void findCeilFloor() {

        System.out.print("The given array is : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        for (int num = 0; num <= 10; num++) {
            int ceil = -1;
            int floor = -1;

            // Find ceiling
            for (int x : arr) {
                if (x >= num) {
                    ceil = x;
                    break;
                }
            }

            // Find floor
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] <= num) {
                    floor = arr[i];
                    break;
                }
            }

            System.out.println("Number: " + num +
                    " ceiling is: " + ceil +
                    " floor is: " + floor);
        }
    }
}

// Child class 2
class Matrix extends ArrayOperation {

    void secondMaxColumn() {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int col = 0; col < 3; col++) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int row = 0; row < 3; row++) {
                int val = mat[row][col];

                if (val > max) {
                    secondMax = max;
                    max = val;
                } else if (val > secondMax && val != max) {
                    secondMax = val;
                }
            }

            System.out.println("Second max in column " + (col + 1) + ": " + secondMax);
        }
    }
}

// Main class
class CeilFloorApp{
    public static void main(String[] args) {

        // Ceil & Floor
        CeilFloor cf = new CeilFloor();
        int[] a = {1, 3, 5, 7, 8, 9};
        cf.setArray(a);
        cf.findCeilFloor();

        System.out.println();

        // Matrix
        Matrix m = new Matrix();
        m.secondMaxColumn();
    }
}
