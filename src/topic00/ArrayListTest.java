package topic00;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListTest {
    
    public static void main(String []args){
        
        
        int [] intArray = new int [10];
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<String> strArrayList = new ArrayList<String>();
        
        strArrayList.add("3");
        
        strArrayList.add("Bilel");
        strArrayList.add("Ahmed");
        
        System.out.println("intArray Length: "+ intArray.length);
        System.out.println("intArrayList size: "+ intArrayList.size());
        
        
        for (int i=0;i<intArray.length;i++){
            intArray[i]=(int)(Math.random()*10);
        }
        
        
        intArrayList.add(3);
        intArrayList.add(5);
        intArrayList.add(-43);
        intArrayList.add(13);
        System.out.println("intArrayList before sorting: "+ intArrayList);      
        
        Collections.sort(intArrayList);
        
         System.out.println("intArrayList after sorting: "+ intArrayList);  
         
         System.out.println("max of intArrayList: "+ Collections.max(intArrayList));
         System.out.println("min of intArrayList: "+ Collections.min(intArrayList));
        
    }
    
}
