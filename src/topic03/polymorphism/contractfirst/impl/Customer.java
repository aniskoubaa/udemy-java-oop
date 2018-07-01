package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.util.Address;

public class Customer {
    
    private String ID;
    private String fullName;
    private Address address;
    
        
    public Customer (String ID, String FullName, Address address){
        setID(ID);
        setFullName(FullName);
        setAddress(address);
    }


    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", fullName=" + fullName + ", address=" + address + "}\n";
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
}
