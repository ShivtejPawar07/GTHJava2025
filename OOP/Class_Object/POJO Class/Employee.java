class Employee {
    // 1️⃣ Private fields
    private int id;
    private String name;
    private double salary;

    // 2️⃣ Setter methods (no constructor used)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 3️⃣ Method to calculate bonus
    public double calculateBonus() {
        double bonus;
        if (salary >= 100000) {
            bonus = salary * 0.15;
        } else if (salary >= 50000 && salary < 100000) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }
        return bonus;
    }

    // 4️⃣ Method to display details
    public void displayEmployeeDetails() {
        double bonus = calculateBonus();
        double totalCompensation = salary + bonus;

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Compensation: " + totalCompensation);
    }
}