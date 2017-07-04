/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class Test1 {
    
    Test1(){
    
    this(10);
    System.out.println("0 Argument Constructor");
}
    Test1(int a){
        this(20,10);
        System.out.println("1 Argument Constructor");
    }
    Test1(int a, int b){
        
        System.out.println("2 Argument Constructor");
    }
    
    public static void main(String[] args){ 
            
        // TODO code application logic here
            
            Test1 t1 = new Test1();
           
           // Test1 t2 = new Test1(10);
            // Test1 t3 = new Test1(10,20);
            
            
            
            
            
           
    }
    
}
