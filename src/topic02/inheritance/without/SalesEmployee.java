package topic02.inheritance.without;

public class SalesEmployee {
    
    private String firstName;
    private String lastName;
    private String id;
    private double sales;
    private double commission;
    
    public SalesEmployee(String firstName, String lastName, 
            String id, double sales, double commission ){
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        setSales(sales); 
        setCommission(commission);
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
    
    public double getSales(){
        return sales;
    }
    
    public void setSales(double sales){
        if (sales>=0.0)//data validation
            this.sales = sales;
        else
            throw new IllegalArgumentException(" sales must be greater than 0.0");
    }
    
    public double getCommission(){
        return commission;
    }
    
    public void setCommission(double rate){
        if ((rate>=0.01)&&(rate<1.0))
            commission = rate;
        else
            throw new IllegalArgumentException("Commission must in in the interval [0.0, 1.0]");
    }
    
    public double totalSalary(){
        return commission*sales;//0.1 * 1000 = 100
    }
    
    
    public String toString(){
        return String.format("sales employee: %s %s\n"
                + "id: %s \n"
                + "sales: %.2f \n"
                + "commission: %.2f", firstName, 
                lastName, id, 
                sales, commission);
    }
    
}
