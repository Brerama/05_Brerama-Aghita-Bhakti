/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobathread;

import static java.lang.Thread.sleep;
/**
 *
 * @author USER
 */
public class ThreadCelana{
    
    public static void main(String[] args) {
        Thread t1=new Runner1();
        Thread t2=new Runner2();
        
        
        t1.start();
        t2.start();
        
    }
}

class Runner1 extends Thread{
    public void run(){
        for (int i = 0;i <=4;i++){
            System.out.println("Thread Celana-2 :Posisi "+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
            e.printStackTrace();}
        }
    }
}

class Runner2 extends Thread{
    public void run(){
        for (int i = 0;i <=4;i++){
            System.out.println("Thread Celana-1 :Posisi "+i);
            try{
                Thread.sleep(125);
            }catch (InterruptedException e){
            e.printStackTrace();}
        }
    }
}