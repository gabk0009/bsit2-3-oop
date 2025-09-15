public class Main {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===");

        Manager manager = new Manager("Alice Smith", 2001, 80000.0, "Engineering", 15000.0, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000.0, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000.0, "Engineering", "Tech University", true);
        System.out.println();

        System.out.println("--- Employee Details ---");
        manager.displayInfo();
        manager.work();
        System.out.printf("Monthly Salary: $%.1f%n%n", manager.calculateSalary());

        System.out.println("--- Employee Details ---");
        developer.displayInfo();
        developer.work();
        System.out.printf("Monthly Salary: $%.1f%n%n", developer.calculateSalary());

        System.out.println("--- Employee Details ---");
        intern.displayInfo();
        intern.work();
        System.out.printf("Monthly Salary: $%.1f%n", intern.calculateSalary());
    }
}
