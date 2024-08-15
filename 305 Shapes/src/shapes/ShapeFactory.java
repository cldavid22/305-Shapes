/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */
package shapes;
/** 
 * Static methods to call constructors from all 
 * the different shape classes.
 *  
 * @author Christian David 
 * @version 14 Oct 2022 
 */
public final class ShapeFactory {
    
    /**
     * If class was not indicated final from the start
     * this indicates it cannot be called from other classes. 
     */
    private ShapeFactory() {
        
    }
    
    /**
     * Creates a static method to call the constructor from circle class
     * to input the radius.
     * 
     * @param theRadius calls a radius value. 
     * @return returns the radius.
     */
    public static Circle createCircle(final double theRadius) {
        return new Circle(theRadius);
    }
    
    /**
     * Creates a static method to call the constructor from triangle class
     * to input the base and height.
     * 
     * @param theBase calls a base value. 
     * @param theHeight calls a height value.
     * @return returns the base and height values .
     */
    public static Triangle createTriangle(final double theBase, final double theHeight) {
        return new Triangle(theBase, theHeight);
    }
    
    /**
     * Creates a static method to call the constructor from rectangle class
     * to input the length and width. 
     * 
     * @param theLengh calls a length value.
     * @param theWidth calls a width value.  
     * @return returns the length and width values.
     */
    public static Rectangle createRectangle(final double theLength, final double theWidth) {
        return new Rectangle(theLength, theWidth);
    }
    
    /**
     * Creates a static method to call the constructor from square class
     * to input the side length. 
     * 
     * @param theSide calls a side length value. 
     * @return returns the side length value.
     * 
     */
    public static Square createSquare(final double theSide) {
        return new Square(theSide);
    }
}
