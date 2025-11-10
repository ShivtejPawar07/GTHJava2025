class EmployeeApp {
    public static void main(String[] args) {
        Employee e = new Employee();

        // Set data using setter methods
        e.setId(101);
        e.setName("Shivtej Pawar");
        e.setSalary(95000);

        // Display details
        e.displayEmployeeDetails();
    }
}