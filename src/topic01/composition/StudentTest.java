package topic01.composition;

public class StudentTest {
    public static void main(String []args){
            
        
        //Date birthdate1 = new Date(1,1,1980);
        Student student1 = new Student("Mohamed", "Salah", new Date(1,1,1980));//inline
        Date birthdate2 = new Date(1,2,1983);
        Student student2 = new Student("Ahmed", "Kamal", birthdate2);       
        
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        
        //we would like to print the day of birth of student 1
        System.out.println("Day of birth of student 1: "+ student1.getBirthDate().getDay());
        //the year of birth of student 2
        System.out.println("Year of birth of student 2: "+ student2.getBirthDate().getYear());
        //change the year of birth of student1 from 1980 to 1982
        //orginal birth date: 1/1/1980
        //new birth date: 1/1/1982
        //first approach: changing the whole date
        student1.setBirthDate(new Date(1,1,1982));
        System.out.println("student1: "+ student1);
        System.out.println("student1 year of birth: "+ student1.getBirthDate().getYear());
        //second approach: change the value of the year inside the date object
        student1.getBirthDate().setYear(1985);
         System.out.println("student1: "+ student1);
        System.out.println("student1 year of birth: "+ student1.getBirthDate().getYear());
        student1.getBirthDate().setMonth(10);
        System.out.println("student1: "+ student1);
        
        
        //exercise:
        //create a student 3 called Kamel Mounir is born on 12,3,1990
        //change the day of birth to 15
        //change the month of birth to 5
        //change the year of birth to 1991
        //display the new birth date object
        
        Student student3 = new Student("Kamel", "Mounir", new Date(12,3,1990));
        System.out.println("student3 :"+ student3);
        //student3.setBirthDate(new Date(15,5,1991));
        student3.getBirthDate().setDay(15);
        student3.getBirthDate().setMonth(5);
        student3.getBirthDate().setYear(1991);
        
        System.out.printf("student3 is born on %d/%d/%d :\n", 
                student3.getBirthDate().getDay(),
                student3.getBirthDate().getMonth(),
                student3.getBirthDate().getYear());
        
        
        
    }
}
