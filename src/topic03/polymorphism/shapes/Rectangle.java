package topic03.polymorphism.shapes;


public class Rectangle extends TwoDShape{
    
    public Rectangle(String name, double length, double width){
        super(name, length, width);
    }
    
    public double getLength(){
        return getX();
    }
    
    public double getWidth(){
        return getY();
    }
    
    public void setLength(double length){
        setX(length);
    }
    
    public void setWidth(double width){
        setY(width);
    }
    
    
    public double getArea(){
        return this.getLength()*this.getWidth();
    }
    
    @Override 
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
    
}
