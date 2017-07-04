/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abhishek
 */
public class Priority2 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println(" Running Thread is:" +Thread.currentThread().getName());
        System.out.println(" Running Thread Priority is:" +Thread.currentThread().getPriority());
        
        }
    }
    public static void main(String args[]){
        Priority2 t1= new Priority2();
        Priority2 t2= new Priority2();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        
        
        
        
    }
    
}
