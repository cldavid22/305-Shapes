/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */
package shapes;
/** 
 * Creates a subclass called Rectangle that is extended from
 * the class Shape to return area and name. 
 * Also, returns the length and width of the rectangle.
 *  
 * @author Christian David 
 * @version 14 Oct 2022 
 */
public final class Rectangle extends AbstractShape {
    
    /**Creates an instance field for length.*/
    private final double myLength;
    
    /**Creates an instance field for width.*/
    private final double myWidth;

    /** 
     * Creates constructor to pass a length and width
     * and throws an exception to avoid wrong 
     * values to be passed.
     * 
     * @param theLength constructor that passes a length.
     * @param theWidth constructor that passes a width.
     */
    Rectangle(final double theLength, final double theWidth) {
        super();
        if (theLength <= 0 & theWidth <= 0) {
            throw new IllegalArgumentException("The Width passed to Rectangle"
             + "constructior was not less than 0, it was:" + theWidth); 
        }
        if (theLength <= 0) {
            throw new IllegalArgumentException("The Length passed to Rectangle"
             + "constructior was not greater than 0, it was:" + theLength); 
        }
        myLength = theLength; 
        myWidth = theWidth; 
    }
        
    @Override 
    /** 
     * Creates a method to return the area of a rectangle.
     * @return the area of the shape rectangle.
     */
     public double area() {
        return myLength * myWidth;
    }
    
    @Override
    /** 
     * Creates a method to return the name of the shape,
     * which is rectangle. 
     * @return the name of the shape rectangle. 
     */
     public String name() {
        return "Rectangle";
         
    }
    /** 
     * Creates a method to return the length 
     * of a rectangle.
     * @return the length of a rectangle.
     */
    public double getRectangleLength() {
        return myLength;
    }
    /** 
     * Creates a method to return the width 
     * of a rectangle.
     * @return the width of a rectangle.
     */
    public double getRectangleWidth() {
        return myWidth;
    }

}
