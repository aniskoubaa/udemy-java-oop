package topic03.polymorphism.shapes;


public class Circle extends TwoDShape{
    
    public Circle(String name, double radius){
        super(name, radius, 1);
    }
    
    public void setRadius(double radius){
        setX(radius);
    }
    
    public double getRadius(){
        return getX();
    }
    
   
    public double getArea(){
        return this.getRadius()*this.getRadius()*Math.PI;
    }
    
        
    public String toString(){
        return String.format("%s is a circle (%.2f)", 
                super.toString(), getRadius());
    }
    
    @Override 
    public double getPerimeter(){
        return 2*getRadius()*Math.PI;
    }
    
}
