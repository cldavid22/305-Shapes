/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */
package shapes;
/** 
 * Creates a subclass called Triangle that is extended from
 * the class Shape to return area and name. 
 * Also, returns the base and height of a triangle. 
 *  
 * @author Christian David 
 * @version 14 Oct 2022 
 */ 
public final class Triangle extends AbstractShape {
    
    /**Creates an instance field for height.*/
    private final double myHeight;
    
    /**Creates an instance field for base.*/
    private final double myBase;

    /** 
     * Creates constructor to pass a base and height
     * and throws an exception to avoid wrong 
     * values to be passed.
     * 
     * @param theBase constructor that passes a base.
     * @param theHeight constructor that passes a height.
     */
    Triangle(final double theBase, final double theHeight) {
        super();
        if (theBase <= 0) {
            throw new IllegalArgumentException("Base passed to Triangle"
             + "constructior was less than 0, it was:" + theBase); 
        }
        if (theHeight <= 0) {
            throw new IllegalArgumentException(" Height passed to Triangle"
             + "constructior was not greater than 0, it was:" + theHeight); 
        }
        myHeight = theHeight; 
        myBase = theBase; 
        
    }
    
    @Override
    /** 
     * Creates a method to return the area of a triangle.
     * @return the area of the shape triangle.
     */
     public double area() {
        return (myHeight * myBase) / 2;
    }
    
    @Override
    /** 
     * Creates a method to return the name of the shape,
     * which is triangle. 
     * @return the name of the shape triangle. 
     */
     public String name() {
        return "Triangle";
         
    }     
    
    /** 
     * Creates a method to return the height 
     * of a triangle.
     * @return the height of a triangle.
     */
    public double getTriangleHeight() {
        return myHeight;
    }
    
    /** 
     * Creates a method to return the base 
     * of a triangle.
     * @return the base of a triangle.
     */
    public double getTriangleBase() {
        return myBase;
    }
}
