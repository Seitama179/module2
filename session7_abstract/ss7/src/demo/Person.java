package demo;

public abstract class Person {
    private String name;
    private int id;
    private String dob;
    private String address;
    public Person() {}
    public Person(String name, int id, String dob, String address) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void moveCompany();
}
