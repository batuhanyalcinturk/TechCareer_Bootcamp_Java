package com.graysan;

// Extends
public class _13_Threading extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Başladım");
            for (int i =1 ; i <=10 ; i++) {
                Thread.sleep(1000);
                System.out.print(i+" ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.Class");
        _13_Threading threadingA=new _13_Threading();
        _13_Threading threadingB=new _13_Threading();
        _13_Threading threadingC=new _13_Threading();

        System.out.println("ID: "+threadingA.getId());
        System.out.println("NAME: "+threadingA.getName());
        threadingA.setName("Degisti44");
        System.out.println(threadingA.getName());
        System.out.println(threadingA.isAlive());

        threadingA.start();
        threadingA.join();
        threadingB.start();
        threadingC.start();
    }
}

// Implements
class _13_Threading2 implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Başladım");
            for (int i =1 ; i <=10 ; i++) {
                Thread.sleep(1000);
                System.out.print(i+" ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("2.Class");
    }
}

// Anonymous
class _13_Threading3 {

    public static void main(String[] args) {
        System.out.println("3.Class");
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Başladım");
                    for (int i =1 ; i <=10 ; i++) {
                        Thread.sleep(1000);
                        System.out.print(i+" ");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
