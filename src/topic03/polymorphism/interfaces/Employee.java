
package topic03.polymorphism.interfaces;



public abstract class Employee implements Payable{
    
    private String firstName;
    private String lastName;
    private String Ssn;
    
    
      
    public Employee(String first, String last, String ssn ){
        firstName = first;
        lastName = last;
        Ssn = ssn;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String last){
        lastName=last;
    }
    
    public String getSsn(){
        return Ssn;
    }
    
    public void setSsn (String ssn){
        Ssn=ssn;
    }
    
    
    public abstract double totalSalary();
    
    @Override
    public String toString(){
        return String.format("employee: %s %s\n"
                + "social security number: %s \n"
                , firstName, lastName, Ssn);
    }
    
}
