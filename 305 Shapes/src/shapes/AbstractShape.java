/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */ 
package shapes;
/** 
 * 
 * Makes an abstract AbstractShape class that implements
 * two abstract methods an area and a name. Also an 
 * compareTo method and a toString method to be implemented by different
 * subclasses of other shapes.  
 * 
 *  
 * @author Christian David 
 * @version 14 Oct 2022 
 */ 
public abstract class AbstractShape implements Comparable<AbstractShape> {
    
    /**Creates an abstract method of the area of a shape.*/
    public abstract double area();
    /**Creates an abstract method of the name of a shape.*/
    public abstract String name();
    
    
    @Override
    /**
     * Creates an compareTo method to compare the 
     * current shape of the shape thats passed
     * based by name and area. 
     * 
     * @param theShape passes the current shape.
     * @return returns the shape thats being passed.
     * 
     */
    public int compareTo(final AbstractShape theShape) {
        if (theShape == null) {
            throw new IllegalArgumentException("The shape passed cannot be null");
        }
        int value = 0;
        if (name().equals(theShape.name())) { 
            if (area() > theShape.area()) {
                value = 1;
                
            }
            if (area() < theShape.area()) {
                value = -1;
            }
        
        } else {
            if (name().compareTo(theShape.name()) > 0) {
                value = 1; 
                 
            }
            if (name().compareTo(theShape.name()) < 0) {
                value = -1; 
            }
        }
        return value;
    }
  
    @Override
     /**
      * Creates a toString method to call the name
      * and area of the shape. 
      */
    public String toString() { 
        return "Name: " + name() + ", " + "Area: " + area();
    }   
}
