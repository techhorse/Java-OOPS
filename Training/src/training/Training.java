/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author Abhishek
 */



public class Training {
private int data = 40;
    /**
     * @param args the command line arguments
     */
     private  void msg(){
        
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Training object = new Training();
        System.out.println(object.data);
        object.msg();
        
        
    }
    
}
