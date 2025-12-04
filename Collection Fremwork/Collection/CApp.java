import java.util.*;

class CApp {
    public static void main(String[] x) {

        ArrayList<Integer> al = new ArrayList<>();

        // add()
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // iterator()
        Iterator i = al.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }

        // size()
        int a = al.size();
        System.out.println("Size=" + a);

        // isEmpty()
        boolean b = al.isEmpty();
        System.out.println("isEmpty=" + b);

        // contains()
        boolean b1 = al.contains(30);
        System.out.println("Found=" + b1);

        // remove(Object)
        boolean b2 = al.remove(Integer.valueOf(30));
        System.out.println("remove=" + b2);

        // New Collection
        Collection<Integer> c = new ArrayList<>();
        c.add(50);
        c.add(60);
        c.add(70);
        c.add(80);

        // iterator()
        Iterator ii = c.iterator();
        while (ii.hasNext()) {
            Object obj = ii.next();
            System.out.println(obj);
        }

        // containsAll()
        boolean b3 = al.containsAll(c);
        System.out.println("containAll=" + b3);

        // addAll()
        boolean b4 = al.addAll(c);
        System.out.println("addAll=" + b4);

        // print al after addAll
        i = al.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }

        //removeAll()
        boolean b5 = al.removeAll(c);
        System.out.println("removeAll=" + b5);

        // print after removeAll
        System.out.println("After removeAll: " + al);

        // clear()
        al.clear();
        System.out.println("After clear: " + al);
        System.out.println("isEmpty=" + al.isEmpty());
    }
}
