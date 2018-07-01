package topic01.classes;


public class StudentTestToString {
    public static void main(String []args){
            
        
        Student student1 = new Student("Mohamed", "Salah", 23, "12345", "0512345678", "Saudi Arabia");
        Student student3 = new Student();
        Student student2 = new Student("Ahmed", "Kamal", 26, "12346", "0512345699", "Tunisia");
        
        student1.setAddress("Riyadh, Saudi Arabia");
        
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        
    }
}
