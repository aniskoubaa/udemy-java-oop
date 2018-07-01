package topic03.polymorphism.shapes;

import java.util.ArrayList;

public class ShapePolymorphismTest {
    
    public static void main(String []args){
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        
        shapes.add(new Circle("C1", 3.4));
        shapes.add(new Circle("C2", 6.4));
        shapes.add(new Rectangle("R1", 5, 9));
        shapes.add(new Rectangle("R2", 4, 39));
        shapes.add(new Square("S1", 3.4));
        shapes.add(new Square("S2", 6.4));
        shapes.add(new Cube("Cu1", 3.44));
        
        //polymorphic processing 
        
        for (int i=0;i<shapes.size();i++){
            
           Shape shape = shapes.get(i);
           
           //if shape is a circle, print the radius
           if (shape instanceof Circle){
               //downcasting
               System.out.println("radius of the circle is: "+ ((Circle)shape).getRadius());
           }
           //if shape is a rectangle print the length
           if (shape instanceof Rectangle){
               //downcasting
               System.out.println("Length of the rectangle is: "+ ((Rectangle) shape).getLength());
           }
           
           //if shape is a square print the side
            if (shape instanceof Square){
                System.out.println("Side of the Square is: "+ ((Square) shape).getSide());
            }
        }
        
        
        
        
    }    
}
