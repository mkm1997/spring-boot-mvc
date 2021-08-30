package com.mkm.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {


    @Id
    private Long id;
    private String name;
    private int age;

    public Alien() {
        System.out.println("Alien Object is created");
    }

    public Alien(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
