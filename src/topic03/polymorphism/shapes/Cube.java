package topic03.polymorphism.shapes;


public class Cube extends ThreeDShape{
    
    public Cube (String name, double side){
        super(name,side,side,side);
        setX(side); 
    }

    public double getSide() {
        return this.getX();
    }

    public void setSide(double side) {
        setX(side);
    }
    
    public double getArea(){
        return getSide()*getSide();
    }
    
        
    public String toString(){
        return String.format("%s is a cube (%.2f)", 
                super.toString(), getSide());
    }
    
}
