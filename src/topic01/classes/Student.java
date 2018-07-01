package topic01.classes;


public class Student {
    
    //attributes or instance variables
    private String firstName;
    private String lastName;
    private  int age;
    private String id;
    private String mobilePhone; //05xxxxxxxxxx
    private String address;
    
    
    //static member or class-wide attribute
    static private int counter = 0;
    
    
    public static int getCounter(){
        return counter;
    }
    
    
    //constructor overloading 
    
    //create a constructor with four arguments (parameters)
    public Student(String fn, String ln, int a, String ID){
        setFirstName(fn);
        setLastName(ln);
        setAge(a);
        setId(ID);
        
        counter = counter +1;
    }

    public Student(String firstName, String lastName, int age, 
            String id, String mobilePhone, String address) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setId(id);
        setMobilePhone(mobilePhone);
        setAddress(address);
        
        counter = counter +1;
    }
    
    
    
    //define default constructor
    public Student(){
        counter = counter +1;
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
    
    public int getAge(){
        return age;
    }
    
    public String getmobilePhone(){
        return mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone){
        //data validation: it must start with "05" and also it must have 10 digit
        if(mobilePhone.startsWith("05") && mobilePhone.length()==10)
            this.mobilePhone = mobilePhone;
        else throw new IllegalArgumentException("mobile phone must start with 05 and have 10 digits");
        
    }
    
    
    //enforce only valid values
    //data validation
    //age must be greater than 0
    public void setAge(int age){
        if (age>0)
            this.age = age;
        //throw an exception
        else throw new IllegalArgumentException("age must be greater than 0");
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    //operations or methods
    
    public void printInfo(){
        System.out.println("Student Information");
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Age: "+ age);
        System.out.println("ID: "+ id);
        System.out.println("Phone: "+ mobilePhone);
    }

    
    //json
    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
    
    
    
}
