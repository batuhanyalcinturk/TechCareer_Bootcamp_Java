package com.oop.interfacex;

import java.io.Serializable;

public class MainInterface implements ICrud, Serializable {

    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void list() {
        System.out.println("list");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
