package org.example.students;

 public class Student {
    private final String name;
    private final int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return  "id=" + id + ", name='" + name;
    }
}