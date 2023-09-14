package org.example;

public class Teacher extends User{

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, String objectToTeach, int age) {
        super(name);
        this.objectToTeach = objectToTeach;
        this.age = age;
    }

    public String getObjectToTeach() {
        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    private String objectToTeach;
    private int age;

}
