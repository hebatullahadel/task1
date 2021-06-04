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
public abstract class  Shape {
  private int color;
  protected static int red=1;
  protected static int blue=2;
  protected static int green=3;

    public Shape(int color) {
        this.color = color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
 public abstract double getArea();
}
