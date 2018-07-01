package topic01.classes;

public class TimeTest {
    public static void main(String []args){
        
        
        Time t1 = new Time(1, 2, 3);
        Time t2 = new Time (2);
        Time t3 = new Time (3, 40);
        
        //t4 is a copy of t1
        Time t4 = new Time (t1);
        

        System.out.println("t1: "+ t1);
        System.out.println("t2: "+ t2);
        System.out.println("t3: "+ t3);
        System.out.println("t4: "+ t4);
        
    }
    
}
