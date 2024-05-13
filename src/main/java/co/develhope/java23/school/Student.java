package co.develhope.java23.school;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    private String name;
    private String email;
    private int age;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    public Student(){

    }

    public Student(String name, String email, int age, long id) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }


}
