package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.interfaces.Laptop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaptopImpl extends ComputerImpl implements Laptop{
    
   public static final String [] BRANDS = {"HP", "MAC", "LENOVO"};

    public LaptopImpl(String id, double price, String brand, int ram) {
        super(id, price, brand, ram);      
    }
    
    
    @Override
    public void setBrand(String brand) {
        List<String> brandList = Arrays.asList(BRANDS);
        if (brandList.contains(brand))
            super.setBrand(brand);
    }
    
    
    @Override
    public void setId(String ID){
        if (ID.startsWith("LP"))
            super.setId(ID);
    }
      
    
}
