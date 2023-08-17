package com.oop.inheritancex;

public class MainInheritance {

    public static void main(String[] args) {
        System.out.println("*************************");
        Student student = new Student();
        student.setId(44L);
        student.setName("Student name ");
        student.setSurname("Student surname");
        student.getData();
        System.out.println(student.hashCode());
        System.out.println(student);

        System.out.println("*************************");
        Teacher teacher = new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher name ");
        teacher.setSurname("Teacher surname");
        teacher.getData();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);
    }
}
