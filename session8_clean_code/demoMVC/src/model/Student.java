package model;

public class Student extends Person {
    private String classRoom;
    public Student() {
    }
    public Student(int id, String name, String address, String classRoom) {
        super(id, name, address);
        this.classRoom = classRoom;
    }
    public String getClassRoom() {
        return classRoom;
    }
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
