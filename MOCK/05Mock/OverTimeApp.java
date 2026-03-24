/*Q4. Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is  Rs.50/- (per 
Hour). Daily shift hour time is only 8 hours.  
Note- for a week only 40 hours of working are allowed. 
     
1. Create class Employee with data member ID, Name, total working, salary, overtime Set 
Information by using a parameterized constructor and create a display Information() method to 
 display all information with salary. 
 2. Create another class name as OverTime with method setEmployee(Employee emp[ ]) and  
 void calculateOvertime() to calculate overtime.*/
 
// Employee class
class Employee {
    int id;
    String name;
    int totalWorkingHours;
    double salary;
    int overtimeHours;

    // Parameterized constructor
    Employee(int id, String name, int totalWorkingHours, double salary) {
        this.id = id;
        this.name = name;
        this.totalWorkingHours = totalWorkingHours;
        this.salary = salary;
        this.overtimeHours = 0;
    }

    // Display method
    void displayInformation() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Salary: Rs." + salary);
        System.out.println("---------------------------");
    }
}

// OverTime class
class OverTime {
    Employee[] e;

    void setEmployee(Employee e[]) {
        this.e = e;
    }

    void calculateOvertime() {
        for (int i = 0; i < e.length; i++) {

            if (e[i].totalWorkingHours > 40) {
                e[i].overtimeHours = e[i].totalWorkingHours - 40;
                e[i].salary = e[i].salary + (e[i].overtimeHours * 50);
            }
        }
    }
}

// Main class
class OverTimeApp {
    public static void main(String[] x) {

        Employee[] emp = new Employee[5];

        emp[0] = new Employee(1, "Amit", 45, 10000);
        emp[1] = new Employee(2, "Rahul", 38, 10000);
        emp[2] = new Employee(3, "Sneha", 50, 10000);
        emp[3] = new Employee(4, "Priya", 42, 10000);
        emp[4] = new Employee(5, "Rohit", 40, 10000);

        OverTime ot = new OverTime();
        ot.setEmployee(emp);
        ot.calculateOvertime();

        // Display all employees
        for (int i = 0; i < emp.length; i++) {
            emp[i].displayInformation();
        }
    }
}
