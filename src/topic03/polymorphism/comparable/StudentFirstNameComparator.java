package topic03.polymorphism.comparable;

import java.util.Comparator;


public class StudentFirstNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getFirstName().compareTo(student2.getFirstName());
    }
    
    
    
    
}
