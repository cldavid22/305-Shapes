/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */
package shapes;
/** 
 * Creates a subclass called Circle that is extended from
 * the class Shape to return area and name. 
 * Also, returns the radius of the circle.
 *  
 * @author Christian David 
 * @version 14 Oct 2022 
 */
public final class Circle extends AbstractShape {
    
    /** Creates an instance field for radius.*/
    private final double myRadius;
    
    /** 
     * Creates constructor to pass a radius 
     * and throws an exception to avoid wrong 
     * values to be passed.
     * 
     * @param theRadius constructor that passes a radius.
     * 
     */
    Circle(final double theRadius) {
        super();
        if (theRadius <= 0) {
            throw new IllegalArgumentException("Radius passed to Circle"
             + "constructior was not greater than 0, it was:" + theRadius); 
        }
        myRadius = theRadius; 
    }
      
    @Override
    /** 
     * Creates a method to return the area of a circle.
     * @return the area of the shape circle.
     */
     public double area() {
        return Math.PI * Math.pow(myRadius, 2);
    }
    
    @Override
    /** 
     * Creates a method to return the name of the shape,
     * which is circle. 
     * @return the name of the shape circle.
     */
     public String name() {
        return "Circle";
         
    }
    /** 
     * Creates a method to return the radius 
     * of a circle.
     * @return the radius of a circle.
     */
    public double getRadius() {
        return myRadius;

    }

}
