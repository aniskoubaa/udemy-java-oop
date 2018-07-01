package topic03.polymorphism.employees;


public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String id;

    public Employee(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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
    
    public String getId(){
        return id;
    }
    
    public void setId (String ID){
        id=ID;
    }
    
    public abstract double totalSalary();
    
    public String toString(){
        return String.format("employee: %s %s\n"
                + "id: %s \n", firstName, 
                lastName, id);
    }
    
}
