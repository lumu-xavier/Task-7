public class Employee {
    String companyName;
    double salary;
    String name;

    public Employee(String companyName, double salary, String name) {
        this.companyName = companyName;
        this.salary = salary;
        this.name = name;
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    final void showCompany() {
        System.out.println("Company Name: " + companyName);
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }


}
