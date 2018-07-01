package topic03.polymorphism.employees;

public class SalesEmployee extends Employee {

    private double sales;
    private double commission;
    
    public SalesEmployee(String firstName, String lastName, 
            String id, double sales, double commission ){
        super(firstName, lastName, id);
        setSales(sales); 
        setCommission(commission);
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
    
    @Override
    public double totalSalary(){
        return commission*sales;//0.1 * 1000 = 100
    }
    
    
    public String toString(){
        return String.format("sales %s"
                + "sales: %.2f \n"
                + "commission: %.2f", super.toString(), 
                sales, commission);
    }
    
}
