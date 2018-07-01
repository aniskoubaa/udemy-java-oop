package topic03.polymorphism.contractfirst.util;


import topic03.polymorphism.contractfirst.impl.Customer;
import topic03.polymorphism.contractfirst.impl.ProductImpl;
import topic03.polymorphism.contractfirst.util.Address;


public class Order {
    
    Customer customer;
    ProductImpl item;
    Address ShippingAddress;

    public Order(Customer customer, ProductImpl item, Address ShippingAddress) {
        this.customer = customer;
        this.item = item;
        this.ShippingAddress = ShippingAddress;
    }

    @Override
    public String toString() {
        return "Order{\n" + "\t customer=" + customer + "\t item=" + item + "\tShippingAddress=" + ShippingAddress + "\n}\n";
    }
    
    

    public Address getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(Address ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ProductImpl getProduct() {
        return item;
    }

    public void setProduct(ProductImpl item) {
        this.item = item;
    }
    
    
    
}
