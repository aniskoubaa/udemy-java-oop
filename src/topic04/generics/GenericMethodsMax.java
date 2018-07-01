package topic04.generics;


public class GenericMethodsMax {

    public static <T extends Comparable<T>> T max (T x, T y, T z){
        T max = x;
        if (y.compareTo(max)>0) max = y;
        if (z.compareTo(max)>0) max = z;
        
        return max;
    }
    
    
    public static void main(String []args){

        System.out.println(max(2,5,3));
        System.out.println(max(2.4,5.7,3.1));
        
        Student s1 = new Student("Mohamed", "Ali");
        Student s2 = new Student("Salah", "Mounir");
        Student s3 = new Student("Ahmed", "Samir");
        
       // System.out.println(max(s1, s2, s3));
        
    }
    
}
