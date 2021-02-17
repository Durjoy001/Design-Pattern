
package factorypattern;
/**
 *
 * @author Durjoy
 */
public class ShapeFactory {
     //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){//return object of Shape
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
