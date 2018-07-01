package topic02.inheritance.with;

public class SalariedEmployee extends SalesEmployee{

    //we do not need to redefine the common attributes of the class
    //SalesEmployee, because the keyword extends will do it for us
    private double baseSalary;

    public SalariedEmployee(String firstName, String lastName, String id, double sales, 
            double commission, double baseSalary) {
        //calls the constructor of the superclass
        super(firstName, lastName,id,sales,commission);
        setBaseSalary(baseSalary);        
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary >= 0) 
        this.baseSalary = baseSalary;
        else throw new IllegalArgumentException("Salary must be greater than 0");
    }
    
    //redefine the method totalSalary() for the salariedEmployee
    //override the method of the superclass: changing the definition of the method
    @Override 
    public double totalSalary(){
        return super.totalSalary() + baseSalary;
    }
    
    @Override
    public String toString(){
        return String.format("salaried and %s\n" 
                + "base salary: %.2f",
                super.toString(), baseSalary);
    }
    
    /*
    public String toString(){
        return String.format("sales employee: %s %s\n"
                + "id: %s \n"
                + "sales: %.2f \n"
                + "commission: %.2f", firstName, 
                lastName, id, 
                sales, commission);
    }
    */
    
    
       
}
