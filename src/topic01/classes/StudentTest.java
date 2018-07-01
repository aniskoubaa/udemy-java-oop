package topic01.classes;


public class StudentTest {
    public static void main(String []args){
            
        
        Student student1 = new Student("Mohamed", "Salah", 23, "12345");
        Student student3 = new Student();
        Student student2 = new Student("Ahmed", "Kamal", 26, "12346");
        
        student1.printInfo();
        //student1.firstName = "Mounir";
        student1.setFirstName("Mounir");
        //System.out.println("Student First Name : "+ student1.firstName);
        System.out.println("Student First Name : "+ student1.getFirstName());
        
        //Student student2 = new Student();
        
        //student2.age=25;
        student2.setAge(25);
        
        
        //student3.firstName = "Ali";
        //student3.lastName="Hamad";
        //student3.age = 29;
        //student3.id="1324";
        
        student3.setFirstName("Ali");
        student3.setLastName("Hamad");
        student3.setAge(15);
        student3.setId("1324");
        
        student1.setMobilePhone("0512345678");
        student2.setMobilePhone("0512345676");
        student3.setMobilePhone("0512345679");
        //student3.age=-24;//value is not valid
        
        
        //print student information 
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        
    }
}
