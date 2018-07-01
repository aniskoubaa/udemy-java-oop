
package topic03.polymorphism.comparable;

import java.util.ArrayList;
import java.util.Collections;


public class Test {
    public static void main(String []args){
        
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(3);
        intList.add(7);
        intList.add(-1);
        intList.add(13);
        intList.add(-6);
        intList.add(5);
        
        System.out.println("intList before sorting: "+ intList);
        Collections.sort(intList);
        System.out.println("intList before sorting: "+ intList);
        System.out.println("max value: "+ Collections.max(intList));
        System.out.println("min value: "+ Collections.min(intList));
        
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Salah");
        strList.add("Ali");
        strList.add("Mohamed");
        strList.add("Ahmed");
        strList.add("Samir");
        strList.add("Baraa");
        
        System.out.println("strList before sorting: "+ strList);
        Collections.sort(strList);
        System.out.println("strList before sorting: "+ strList);
        System.out.println("max value: "+ Collections.max(strList));
        System.out.println("min value: "+ Collections.min(strList));
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        studentList.add(new Student("Mohamed", "Salah", 25));
        studentList.add(new Student("Ali", "Ahmed", 23));
        studentList.add(new Student("Mounir", "Kamal", 27));
        studentList.add(new Student("Ghazi", "Adel", 21));

        System.out.println("studentList before sorting: "+ studentList);
        Collections.sort(studentList);
        System.out.println("studentList after sorting: "+ studentList);
        
        
    }  
}
