/*
What is Pascal’s Triangle?
Pascal’s Triangle is a triangular arrangement of numbers where:
The first and last number in each row is always 1.
Every number in between is the sum of the two numbers above it from the previous row.
Pascale Triangle
*/
class Pascale{
	public static void main(String[]x){
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1

*/   
    System.out.println("Pascale Triangle");
        for (int i = 0; i < 7; i++) {
            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
/*	      1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1

*/
       

        for (int i = 0; i < 5; i++) {

            // spaces
            for (int s = 0; s < 5 - i; s++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
 

	
	}
}