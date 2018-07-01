/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic03.polymorphism;


public class PolymophismTest {
    
    public static void main(String []args){
        Student student = new UndergraduteStudent();
        System.out.println("Undergraduate Student Scholarship: "+ student.getScholarship());
        student = new GraduteStudent();
        student.getScholarship();
        System.out.println("Graduate Student Scholarship: "+ student.getScholarship());
    }
    
}

abstract class Student {
    
    String name;
    String type;
    
    abstract int  getScholarship(); 
}

class UndergraduteStudent extends Student{

    public UndergraduteStudent (){
        super();
       // System.out.println("Undergradate Student is created");
    }
    
    @Override
    int getScholarship() {
        return 0;
    }

}

class GraduteStudent extends Student{

    public GraduteStudent (){
        type="national";
    }
    
    @Override
    int getScholarship() {
        if (type.equalsIgnoreCase("national"))
            return 200;
        else if (type.equalsIgnoreCase("international"))
            return 300;
        else return -1;
    }

}

