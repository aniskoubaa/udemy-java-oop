/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.inheritance.without;

public class EmployeeTest {
    public static void main(String [] args){
        
        SalesEmployee cm = 
                new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.3);
        
        SalariedEmployee bpcm = 
                new SalariedEmployee
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300);
        
        System.out.println(cm+"\n");
        System.out.println(bpcm);
        
        
        
    }
    
}
