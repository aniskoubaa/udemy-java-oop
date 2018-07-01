/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.composition.quiz06;


public class Test {
    public static void main(String []args){
        Street st = new Street("Rafha Street",1);
        Address adr = new Address(st,"Riyadh", "Saudi Arabia");
        Person person = new Person ("Mohamed", "Ali", new Address(new Street("Rafha Street",1),"Riyadh", "Saudi Arabia"));
        
    }
    
}
