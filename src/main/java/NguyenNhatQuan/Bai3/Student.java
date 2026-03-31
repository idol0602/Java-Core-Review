package NguyenNhatQuan.Bai3;

import java.security.PublicKey;

public class Student {
    private String name;
    private int age;
    private String address;
    private float gpa;

    Student(String name, int age, String address, float gpa) {
        setName(name);
        setAge(age);
        setAddress(address);
        setGPA(gpa);
    }

    Student() {
        setName("A");
        setAge(18);
        setAddress("Ha Noi");
        setGPA(0);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public float getGpa() {
        return this.gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }
}
