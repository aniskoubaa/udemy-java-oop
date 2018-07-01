
package topic04.generics;


public class LinearSearch {
    
    public static int linearSearchInt(int [] list, int x){
        
        for (int i=0;i<list.length;i++){
            if (list[i]==x)
                return i;
        }
        
        return -1;
        
    }
    
    public static <E extends Comparable<E>> int linearSearch(E [] list, E x){
        
        for (int i=0;i<list.length;i++){
            if (list[i].compareTo(x)==0)
                return i;
        }
        
        return -1;
        
    }
    
    
    
    public static void main(String []args){
        
        Integer [] intArray = {4,6,2,8,9};
        
        Double [] doubleArray = {4.5,6.7,2.5,8.1,9.2};
        
        String [] strArray = {"AN","BC","PO","OK","PLO"};
        
        
        
        System.out.println(linearSearch(intArray, 2));
        System.out.println(linearSearch(intArray, 9));
        System.out.println(linearSearch(intArray, 10));
        
        System.out.println(linearSearch(doubleArray, 10.0));
        
        System.out.println(linearSearch(strArray, "PO"));
        
    }
    
}
