/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class Emp2 {
    
    
    public Emp2(int eid,String ename, float esal){
    
}
    void disp(){
    
    System.out.prinln("Emp Id = "+eid);
    System.out.prinln("Emp Name = "+ename);
    System.out.prinln("Emp Salary = "+esal);
}
    public static void main(String[] args){ 
            
        // TODO code application logic here
            
            Emp2 t1 = new Emp2(5456,"Sourav",500.56f);
            t1.disp();
            
            Emp2 t2 = new Emp2(5457,"Ajay",55800.56f);
            t2.disp();
            
           
    }
    
}
