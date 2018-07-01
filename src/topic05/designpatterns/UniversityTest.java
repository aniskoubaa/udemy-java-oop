
package topic05.designpatterns;

public class UniversityTest {
 
    public static void main(String []args){
        
        University university = University.getInstance();
        System.out.println(University.counter);
        University univeristy2 = University.getInstance();
        System.out.println(University.counter);
        University university3 = University.getInstance();
        System.out.println(University.counter);
        System.out.println(university.getName());
        System.out.println(university3.getName());
        university.setName("IMAMU");
        System.out.println(university3.getName());
        
       
        
    }
    
    
    
    
    
}
