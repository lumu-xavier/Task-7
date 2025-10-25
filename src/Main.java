public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager(70000000, "LUMU", 1000000);
        mgr.showCompany();
        mgr.displayDetails();
        System.out.println();

        Director dr = new Director(100000000, "Xavier", 5000000);
        dr.showCompany();
        dr.displayDetails();
        dr.makeDecisions();

        System.out.println("This is in My THIRD branch");

    }
}