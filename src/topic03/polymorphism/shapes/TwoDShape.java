package topic03.polymorphism.shapes;


public abstract class TwoDShape extends Shape {
    
    private double x;
    private double y;
    
    public TwoDShape(String name, double x, double y){
        super(name);
        setX(x);
        setY(y);
    }
    
    public void setX(double x){
        if (x>0)
            this.x = x;
        else throw new IllegalArgumentException("X must be > 0");
    }
    
    public void setY(double y){
        if (y>0)
            this.y = y;
        else throw new IllegalArgumentException("Y must be > 0");
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public abstract double getPerimeter();
    
}
