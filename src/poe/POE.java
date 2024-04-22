/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */

public class POE {
    public static void performoption(){
       
System.out.println("Option 1 register");
System.out.println("Option 2 login");
System.out.println("Option 3 Exit");
System.out.println("++++++++++++++");
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner diff = new Scanner(System.in);
        int Diff = diff.nextInt();
        do{
           performoption(); 
           System.out.println("Enter Choice");
           Diff = diff.nextInt();
        
        switch(Diff){
            case 1: 
            Register reg = new Register();
            reg.RegisterUser();
                break;
                case 2:
                Login log = new Login();
                log.Login();
                break;
                case 3:
                System.out.println("EXITING");
                break;
                default:
                System.out.println("Choice Invalid");
                
        }
        Register my = new Register();
        my.RegisterUser();
        
        Login your = new Login();
        your.Login();
                
    }
        while(Diff!=3);
                diff.close();
    
}
}
