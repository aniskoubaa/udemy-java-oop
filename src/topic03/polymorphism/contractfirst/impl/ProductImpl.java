package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.interfaces.Product;

public class ProductImpl implements Product{
    
    private String id;
    private double price;
    
    private static int count =0;
    
  public ProductImpl (String id, double price){
        setId(id);
        setPrice (price);
        count++;
    }
  
      public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ProductImpl.count = count;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String ID) {
        this.id = ID;
    }

 
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\"id\" : %s\", \"price\" : \"%.2f\"}\n";
    }

    @Override
    public int compareTo(Product product) {
        if (id.compareTo(product.getId())!=0){
            return this.id.compareTo(product.getId());
        }else 
        if(this.price>product.getPrice()){
            return 1;
        }else if(this.getPrice()<product.getPrice()){
            return -1;
        }
        return 0;
    }
}
