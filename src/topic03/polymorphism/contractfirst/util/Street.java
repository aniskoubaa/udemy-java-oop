package topic03.polymorphism.contractfirst.util;



public class Street {
    
    private int number;
    private String name;
    private String quarter;

    public Street(int number, String name, String quarter) {
        this.number = number;
        this.name = name;
        this.quarter = quarter;
    }

    @Override
    public String toString() {
        return "Street{" + "number=" + number + ", name=" + name + ", quarter=" + quarter + "}";
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }
        
}
