package com.oop.abstractx;

public class MainAbstract {

    public static void main(String[] args) {

        Person person=new Teacher(); //polymorphism
        person.setId(44L);
        person.setName("person name");
        person.setSurname("person surname");
        person.getData();  //polymorphism
        person.govdesizMethod();
        System.out.println(person.hashCode());
        System.out.println(person);

        System.out.println("************************************");
        Teacher teacher=new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher name");
        teacher.setSurname("Teacher surname");
        teacher.getData();
        teacher.govdesizMethod();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);

        System.out.println("************************************");
        Student student=new Student();
        student.setId(23L);
        student.setName("Student name");
        teacher.setSurname("Student surname");
        student.getData();
        student.govdesizMethod();
        System.out.println(student.hashCode());
        System.out.println(student);
    }
}

