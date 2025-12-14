import java.util.Stack;

class StackExample {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // push()
        st.push(10);
        st.push(20);
        st.push(30);
        // Stack now: [10, 20, 30]

        // peek()
        System.out.println("Top element: " + st.peek());  
        // Output: Top element: 30

        // search()
        System.out.println("Position of 20: " + st.search(20));  
        // Output: Position of 20: 2  (from top)

        // pop()
        System.out.println("Popped: " + st.pop());  
        // Output: Popped: 30
        // Stack now: [10, 20]

        // empty()
        System.out.println("Is stack empty? " + st.empty());
        // Output: Is stack empty? false

        System.out.println("Final Stack: " + st);
        // Output: Final Stack: [10, 20]
    }
}
