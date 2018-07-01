
package topic03.polymorphism.employees;

public class EmployeeTest {
    public static void main(String [] args){
        
        
        //Employee employee = new Employee("Ahmed", "Salah", "1234");
        
        Employee employee = 
                new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.3);
        //total salary = 5000 * 0.3 = 1500
        
        System.out.println("salaried employee total salary: "+ employee.totalSalary());
        
        //superclass: compilation time
        employee = 
                new SalariedEmployee //subclass
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300);
        
        System.out.println("salaried employee total salary: "+ employee.totalSalary());
        
/*        
//downcasting: casting from the superclass to the subclass
        SalariedEmployee se = (SalariedEmployee)salariedEmployee;
        
        //SalariedEmployee se2 = (SalariedEmployee)salesEmployee;
        
        System.out.println("---> the base salary of the salaried employee: "+ 
                ((SalariedEmployee)salariedEmployee).getBaseSalary());
        
        //total salary (superclass)= 5000 * 0.04 = 200
        //total salary (subclass)= 5000 * 0.04 + 300= 500
        
        System.out.println("total salary of sales employee: "+ salesEmployee.totalSalary());
        System.out.println("total salary of salaried employee: "+ salariedEmployee.totalSalary());
        
        System.out.println("sales employee : "+ salesEmployee);
        System.out.println("salaried employee: "+ salariedEmployee);
        
        //processing without polymorphism 
        System.out.println("\n ----- Print Commission Rates without Polymorphism ------");
        
        SalesEmployee [] salesEmployees = new SalesEmployee[4];
        SalariedEmployee [] salariedEmployees = new SalariedEmployee[4];
        
        salesEmployees[0]= new SalesEmployee("Mohamed", "Ali", "333-33-3333",5000, 0.3);
        salesEmployees[1]= new SalesEmployee("Ahmed", "Rajhi", "333-33-3334",6000, 0.33);
        salesEmployees[2]= new SalesEmployee("Salah", "Otaibi", "333-33-3335",7000, 0.31);
        salesEmployees[3]= new SalesEmployee("Mounir", "Megren", "333-33-3336",5600, 0.37);
        
        
        salariedEmployees[0] = new SalariedEmployee ("Kamel", "Sameh", "263-39-3339", 5300, 0.045, 300);
        salariedEmployees[1] = new SalariedEmployee ("Bahaa", "Taha", "263-39-3363", 5050, 0.042, 330);
        salariedEmployees[2] = new SalariedEmployee ("Baraa", "Islam", "263-39-5333", 5010, 0.043, 350);
        salariedEmployees[3] = new SalariedEmployee ("Samir", "Hatem", "263-39-3233", 5300, 0.041, 310);
        
        //------- find the commission rate of all employees ---------
        for (int i=0;i<salesEmployees.length;i++){
            System.out.printf("salesEmployees[%d] commission rate = %.5f\n", i,salesEmployees[i].getCommission());
        }
        
        for (int i=0;i<salariedEmployees.length;i++){
            System.out.printf("salariedEmployees[%d] commission rate = %.5f\n", i,salariedEmployees[i].getCommission());
        }
        
        //polymorphic processing
        System.out.println("\n ----- Print Commission Rates using Polymorphism ------");
        SalesEmployee [] employees = new SalesEmployee[8];
        
        employees[0]= new SalesEmployee("Mohamed", "Ali", "333-33-3333",5000, 0.3);
        employees[1]= new SalesEmployee("Ahmed", "Rajhi", "333-33-3334",6000, 0.33);
        employees[2]= new SalesEmployee("Salah", "Otaibi", "333-33-3335",7000, 0.31);
        employees[3]= new SalesEmployee("Mounir", "Megren", "333-33-3336",5600, 0.37);
        
        
        employees[4] = new SalariedEmployee ("Kamel", "Sameh", "263-39-3339", 5300, 0.045, 300);
        employees[5] = new SalariedEmployee ("Bahaa", "Taha", "263-39-3363", 5050, 0.042, 330);
        employees[6] = new SalariedEmployee ("Baraa", "Islam", "263-39-5333", 5010, 0.043, 350);
        employees[7] = new SalariedEmployee ("Samir", "Hatem", "263-39-3233", 5300, 0.041, 310);
        
        //find the commission rate of all employees
        for (int i=0;i<employees.length;i++){
            System.out.printf("employees[%d] commission rate = %.5f\n", i,employees[i].getCommission());
        }  
        
        
         //------- find the base salary of salaried employees ---------
        System.out.println("\n ----- Find base salary of salaried employees without Polymorphism ------");
        //without polymorphic processing 
         for (int i=0;i<salariedEmployees.length;i++){
            System.out.printf("salariedEmployees[%d] base salary = %.5f\n", i,salariedEmployees[i].getBaseSalary());
        }
         
        System.out.println("\n ----- Find base salary of salaried employees using Polymorphism ------");
        //using polymorphic processing
         for (int i=0;i<employees.length;i++){
             if (employees[i] instanceof SalariedEmployee)
                System.out.printf("employees[%d] base salary = %.5f\n", i,((SalariedEmployee)employees[i]).getBaseSalary());
        }
*/
    }
}
