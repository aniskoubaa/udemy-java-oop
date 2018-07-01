package topic01.composition;

public class Student {
    
    //attributes or instance variables
    private String firstName;
    private String lastName;
    
    private Date birthDate;
    

    //full-argument constructor
    public Student(String fn, String ln, Date bd){
        setFirstName(fn);
        setLastName(ln);
        setBirthDate(bd);
    }

    //get method for firstName
    public String getFirstName(){
        return firstName;
    }
    
    //set method for the firstName: change the value
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    

    @Override
    public String toString() {
        return String.format("%s %s is born %s", firstName, lastName, birthDate);
    }
    
    
    
}
