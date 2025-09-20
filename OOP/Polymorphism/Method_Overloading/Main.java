class Main {
    public static void main(String[] args) {
		 main(10); 
        System.out.println("Default main method");
        
        // Calling overloaded main methods
        main(10);  
        main("Hello");
    }

    // Overloaded main with int parameter
    public static void main(int a) {
        System.out.println("Main with int: " + a);
    }

    // Overloaded main with String parameter
    public static void main(String s) {
        System.out.println("Main with String: " + s);
    }
}
