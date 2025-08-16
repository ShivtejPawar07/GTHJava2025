/* **10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.*/
import java.util.*;

class Student {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int cnt = 0;
        String mark;
		
		do{
			System.out.println("Enter a marks(or type stop to finish)");
			mark=sc.nextLine();
			
			if(mark.equalsIgnoreCase("stop")){
				break;
			}
			int m=Integer.parseInt(mark);
			if(m<0){
				System.out.println("Invalid Input");
				continue;
			}
			totalMarks=totalMarks+m;
			cnt++;
			
		}while(true);
		
		if(cnt>0){
			System.out.println("Average:"+((double)totalMarks/cnt));
		}
		else{
			System.out.println("Invalid Input");
		}

 
    }
}
