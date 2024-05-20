public class FulltimeStaff extends Staff {
    private double bonus;
    private double fine;
    private double basicSalary;

    public FulltimeStaff() {
    }
    public FulltimeStaff(String id, String name, int age, String phoneNumber, String email, double bonus, double fine, double basicSalary){
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.basicSalary = basicSalary;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getFine() {
        return fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    @Override
    public double getSalary() {
        return getBasicSalary() + (getBonus() - getFine());
    }
}
