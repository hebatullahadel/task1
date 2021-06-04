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
public class Circle extends Shape {
   private double radious;
   protected static double PI=3.14;
    public Circle(double radious, int color) {
        super(color);
        this.radious = radious;
    }

    @Override
    public double getArea() {
      return PI*radious*radious; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}';
    }

}
