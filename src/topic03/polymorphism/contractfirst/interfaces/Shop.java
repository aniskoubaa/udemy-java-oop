package topic03.polymorphism.contractfirst.interfaces;


import java.util.List;

public interface Shop {
    
    public abstract List<Product> getProducts();
    
    public abstract void addProduct(Product product);
    public abstract void removeProduct(Product product);
 
    public abstract double getStockValue();
    
    public abstract void saveToFile(String filename);
    
    
    public abstract List<Game> sortedGames ();
}
