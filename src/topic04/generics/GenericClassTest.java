
package topic04.generics;

import java.util.ArrayList;

public class GenericClassTest {
    
    public static void main(String []args){
       
        PairInt pairInt = new PairInt(1,2);
        PairDouble pairDouble = new PairDouble(1.3,3.5);
        
        System.out.println("pairInt: "+ pairInt);
        System.out.println("pairDouble: "+ pairDouble);
        
        pairInt.setKey(3);
        pairInt.setValue(16);   
        
        System.out.println("\nafter changing the values ...\n");
        
        System.out.println("pairInt: "+ pairInt);
        
        pairDouble.setKey(3.8);
        pairDouble.setValue(16.9);   
        System.out.println("pairDouble: "+ pairDouble);
        
        
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        Pair<Integer, Integer> pairIntegerGeneric = new Pair<Integer, Integer>(1,2);
        Pair<Double, Double> pairDoubleGeneric = new Pair<Double, Double>(1.4,3.7);
        
        Pair<String, Student> studentPair = new Pair<String, Student>("ID01", new Student("Mohamed", "Ali"));
        
        System.out.println("studentPair: "+ studentPair);
        studentPair.setKey("ID02");
        System.out.println("studentPair: "+ studentPair);
        studentPair.setValue(new Student("Mounir", "Salah"));
        
        
        Pair<Student, Integer> pairStudent = new Pair<Student, Integer>(new Student("Mounir", "Salah"), 3);
        
    }
    
}
