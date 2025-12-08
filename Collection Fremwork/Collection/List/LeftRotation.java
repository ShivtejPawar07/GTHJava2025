import java.util.*;
class LeftRotation{
	public static void main(String[]x){
		ArrayList<Integer>al=new ArrayList<>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			
		int k = 2;

        // Normalize k
        k = k % al.size();

        ArrayList<Integer> result = new ArrayList<>();

        // Add elements from k to end (left shift)
        for (int i = k; i < al.size(); i++) {
            result.add(al.get(i));
        }

        // Add the first k elements at end
        for (int i = 0; i < k; i++) {
            result.add(al.get(i));
        }

        System.out.println("Original List : " + al);
        System.out.println("After Left Rotation by " + k + " : " + result);
		}
}