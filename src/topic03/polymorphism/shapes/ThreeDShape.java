
package topic03.polymorphism.shapes;


public abstract class ThreeDShape extends Shape{
    
    private double x;
    private double y;
    private double z;
    
    public ThreeDShape(String name, double x, double y, double z){
        super(name);
        setX(x);
        setY(y);
        setZ(z);
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
    
    public void setZ(double z){
        if (z>0)
            this.z = z;
        else throw new IllegalArgumentException("Z must be > 0");
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
}
