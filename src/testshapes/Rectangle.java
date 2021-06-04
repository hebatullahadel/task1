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
public class Rectangle extends Shape {
   private double length ,width;

    public Rectangle(double length, double width, int color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
         return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
   
}
