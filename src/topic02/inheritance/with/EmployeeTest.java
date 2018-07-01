
package topic02.inheritance.with;


public class EmployeeTest {
    public static void main(String [] args){
        
        SalesEmployee salesEmployee = 
                new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.3);
        //total salary = 5000 * 0.3 = 1500
        
        
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300);
        
        //total salary = 5000 * 0.04 + 300 = 200 + 300 = 500
        
        
        //SalesEmployee is the superclass = general class
        //SalariedEmployee is the subclass = specific class
        //any public method/attribute that is defined in the superclass can be accessed by the subclass
        
          System.out.println("first name of salaried employee: "+ salariedEmployee.getFirstName());
          System.out.println("last name of salaried employee: "+ salariedEmployee.getLastName());
          
          System.out.println("total salary salesEmployee: "+ salesEmployee.totalSalary());
          System.out.println("total salary salariedEmployee: "+ salariedEmployee.totalSalary());
          System.out.println("--------------------------------");
          System.out.println("salesEmployee: "+ salesEmployee);
          System.out.println("salariedEmployee: "+ salariedEmployee);
        
    }
}
