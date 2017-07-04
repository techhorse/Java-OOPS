/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp1;

/**
 *
 * @author Abhishek
 */


public class Emp1 {
int eid;
String ename;
float esal;

    /**
     * @param args the command line arguments
     */

public Emp1(int eid,String ename, float esal){
    
}
void disp(){
    
    System.out.prinln("Emp Id = "+eid);
    System.out.prinln("Emp Name = "+ename);
    System.out.prinln("Emp Salary = "+esal);
}
    public static void main(String[] args){ 
            
        // TODO code application logic here
            
            Emp1 t1 = new Emp1(5456,"Sourav",500.56f);
            t1.disp();
            
            
    }
    
}
