public class Manager extends Employee {
    double bonus;

    public Manager(String companyName, double salary, String name, double bonus) {
        super(companyName, salary, name);
        this.bonus = bonus;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        double total = bonus + salary;
        System.out.println("Total Salary: " + total);
    }

}
