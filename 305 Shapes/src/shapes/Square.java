/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */
package shapes;
/** 
 * Creates a subclass called Square that is extended from
 * the class Shape to return area and name. 
 * Also, returns the side length of the square.
 *  
 * @author Christian David 
 * @version 14 Oct 2022 / 
 */ 
public final class Square extends AbstractShape {
    
    /**Creates an instance field for side length.*/
    private final double mySide;

    /** 
     * Creates constructor to pass a side length 
     * and throws an exception to avoid wrong 
     * values to be passed.
     * 
     * @param theSide constructor that passes a side length.
     * 
     */
    Square(final double theSide) {
        super();
        if (theSide <= 0) {
            throw new IllegalArgumentException("Side Length passed to Square"
             + "constructior was not greater than 0, it was:" + theSide); 
        }
        mySide = theSide; 
    }

    @Override
    /** 
     * Creates a method to return the area of a square.
     * @return the area of the shape square.
     */
     public double area() {
        return mySide * mySide;
    }
    
    @Override
    /** 
     * Creates a method to return the name of the shape,
     * which is square. 
     * @return the name of the shape square 
     */
     public String name() {
        return "Square";
         
    }
    /** 
     * Creates a method to return the side length 
     * of a square.
     * @return the side length of a square.
     */
    public double getSquareSide() {
        return mySide;
    }

}
