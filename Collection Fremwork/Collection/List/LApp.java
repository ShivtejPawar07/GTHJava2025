import java.util.*;

class LApp {
    public static void main(String[] x) {

        List<Object> l = new ArrayList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        l.add(1);                // adds at end
        l.add(2, "Shiv");        // insert at index 2

        // get element
        System.out.println("get(5): " + l.get(5));

        // indexOf
        System.out.println("indexOf(20): " + l.indexOf(20));

        // lastIndexOf
        System.out.println("lastIndexOf(1): " + l.lastIndexOf(1));

        // set element (replace index)
        l.set(3, "XYZ");

        // subList (from index 1 to 4, 4 is exclusive)
        List<Object> sub = l.subList(1, 4);
        System.out.println("SubList(1,4): " + sub);

        // remove element
        l.remove(0);       // remove by index
        l.remove("Shiv");  // remove by object

        // iterate
        Iterator<Object> i = l.iterator();
        System.out.println("\nFinal List:");
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}
