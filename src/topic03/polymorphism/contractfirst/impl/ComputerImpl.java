package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.interfaces.Computer;
import topic03.polymorphism.contractfirst.impl.ProductImpl;

public class ComputerImpl extends ProductImpl implements Computer{
    
    private String brand; 
    private int ram;
    

    public ComputerImpl(String id, double price, String brand, int ram) {
        super(id, price);
        setBrand(brand);
        setRam(ram);
        
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

   
    
    
    @Override
    public String toString() {
        return String.format("%s, \"brand\": \"%s\", \"ram\" : \"%d\"}", 
                super.toString(), getBrand(), getRam());
    }
    
}
