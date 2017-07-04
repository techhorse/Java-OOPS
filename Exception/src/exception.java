/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
import java.util.*;
public class exception {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    try{
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the Retrieve array");
    int y = sc.nextInt();
    System.out.println("The value is " +arr[y]);
    }
    catch(Exception e){
    System.out.println("Index out of bound");
    
    }
    System.out.println("Enter the Correct Index");
    int z = sc.nextInt();
    System.out.println("The value is "+arr[z]);
}
}