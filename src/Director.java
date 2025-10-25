public final class Director extends Manager {
    public Director(double salary, String name, double bonus) {
        super(salary, name, bonus);
    }

    void makeDecisions() {
        System.out.println(super.name + " is the Director of this company in charge of making Decisions. ");
    }
    public void Dir() {
        System.out.println("A Director is the power house");
    }
}
