/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobathread;

/**
 *
 * @author USER
 */
public class CobaThread {

    public static void main(String[] args) {
        //TODO code application logic here
        Thread t1 = new Proses1();
        Thread t2 = new Proses2();
        Thread t3 = new Proses3();

        t1.start();
        t2.start();
        t3.start();
    }
}

class Proses2 extends Thread {

    public void run() {
        try {
            sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Proses 2 Berjalan");
    }
}

class Proses1 extends Thread {

    public void run() {
        System.out.println("Proses 1 Berjalan");
    }
}

class Proses3 extends Thread {
    public void run() {
            try {
            sleep(400);
    }
    catch (InterruptedException a) {
            a.printStackTrace();
    }
        System.out.println("Proses 3 Berjalan");
    }
}
