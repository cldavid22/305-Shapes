/*  
 * TCSS 305 Autumn 2022 
 * Assignment 1
 */
package controller;
import java.util.ArrayList;
import java.util.Collections;
import shapes.AbstractShape;
import shapes.ShapeFactory;
/** 
 *
 * Creates a ShapeTester class to pass through values 
 * for all shape classes and puts them into an array list. 
 * Prints each array list and then sorts them based into
 * groups of shapes and its value. 
 *  
 * @author Christian David 
 * @version 14 Oct 2022 
 */
public final class ShapeTester {
    
    /**If class was not indicated final from the start
     * this indicates it cannot be called from other classes. 
     */
    private ShapeTester() {
        
    }

    /**
     * Creates a main method to test the inputs 
     * of each shape class and prints each value on an array list.
     * After, which sorts those shapes and values. 
     * 
     * @param theArgs stores java command line argument.
     */
    public static void main(final String[] theArgs) {
        
        final ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();
        shapes.add(ShapeFactory.createCircle(2));
        shapes.add(ShapeFactory.createCircle(2));
        shapes.add(ShapeFactory.createCircle(5));
        shapes.add(ShapeFactory.createCircle(4));
        shapes.add(ShapeFactory.createCircle(15));
       
        shapes.add(ShapeFactory.createTriangle(2, 2)); 
        shapes.add(ShapeFactory.createTriangle(2, 2));
        shapes.add(ShapeFactory.createTriangle(2, 5));
        shapes.add(ShapeFactory.createTriangle(2, 13));
        shapes.add(ShapeFactory.createTriangle(2, 9));

        shapes.add(ShapeFactory.createRectangle(2, 10));
        shapes.add(ShapeFactory.createRectangle(2, 10));
        shapes.add(ShapeFactory.createRectangle(2, 14));
        shapes.add(ShapeFactory.createRectangle(2, 5));
        shapes.add(ShapeFactory.createRectangle(2, 1));

        shapes.add(ShapeFactory.createSquare(2));
        shapes.add(ShapeFactory.createSquare(2));
        shapes.add(ShapeFactory.createSquare(3));
        shapes.add(ShapeFactory.createSquare(5));
        shapes.add(ShapeFactory.createSquare(8));
  
        System.out.println("Before Sorting:");
        for (final AbstractShape s: shapes) {
            System.out.println(s);

        }
        Collections.sort(shapes);
        System.out.println("After Sorting:");
        for (final AbstractShape s: shapes) {
            System.out.println(s);
      
        }
       
    }
}
