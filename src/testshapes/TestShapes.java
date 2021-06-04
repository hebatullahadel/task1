/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshapes;

/**
 *
 * @author dell
 */
public class TestShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Shape [] shapes = new Shape [4];
    
    shapes [0] = new Circle (3, Shape.red);
    shapes [1] = new Sequare (2, Shape.green);
    shapes [2] = new Circle (3, Shape.blue);
    shapes [3] = new Rectangle (1,2, Shape.red);
    for (int i = 0; i < 4; i++) {
      System.out.println ("Shape number " + i + " is instance of "  + shapes [i].getClass()  + " and its area is " + shapes [i].getArea());
      System.out.println (shapes [i].toString());
    }
    shapes [2] = new Rectangle (3,4, Shape.red);
  }
    
}
