public class ParttimeStaff extends Staff {
    private double workHour;
    public ParttimeStaff() {
    }
    public ParttimeStaff(String id, String name, int age, String phoneNumber, String email, double workHour) {
        super(id, name, age, phoneNumber, email);
        this.workHour = workHour;
    }
    public double getWorkHour() {
        return workHour;
    }
    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getSalary() {
        return getWorkHour() * 100000;
    }
}
