package topic01.classes;


public class StaticMemberTest {
    
    
    public static void main(String []args){
            
        
        Student student1 = new Student("Mohamed", "Salah", 23, "12345", 
                "0512345678", "Address Student 1");
        
        System.out.println("counter: "+ Student.getCounter());
        
       
        Student student2 = new Student("Ahmed", "Kamal", 26, "12346");
        System.out.println("counter: "+ Student.getCounter());
         
        Student student3 = new Student();
        System.out.println("counter: "+ Student.getCounter());
        
        
    }
    
}
