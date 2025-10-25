public final class Director extends Manager {
    public Director(String companyName, double salary, String name, double bonus) {
        super(companyName, salary, name, bonus);
    }

    public Director(double salary, String name, double bonus) {
        super(salary, name, bonus);
    }

    void makeDecisions() {
        System.out.println(super.name + " is the Director of this company in charge of making Decisions. ");
    }
}
