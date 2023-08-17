package com.oop.abstractx;

import java.io.Serializable;

abstract public class Person implements Serializable {

    public static final Long serialVersionUID=1L;

    // Field
    private Long id;
    private String name;
    private String surname;

    // Constructor
    public Person(){
        this.id=0L;
        name = "Adınızı girmediniz";
        surname = "Soyadınızı girmediniz";
    }

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // To String
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                '}';
    }

    // Method
    public void getData(){
        System.out.println("ID: " + id + "Name: " + name + "Surname: " + surname);
    }

    abstract public void govdesizMethod();

    // Getter Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
