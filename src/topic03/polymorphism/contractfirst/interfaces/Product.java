package topic03.polymorphism.contractfirst.interfaces;



public interface Product extends Comparable<Product>{
    
    public abstract String getId();
    public abstract double getPrice();
    
    public abstract void setId(String id);
    public abstract void setPrice(double price);
    
}
