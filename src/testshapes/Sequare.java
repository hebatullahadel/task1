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
public class Sequare extends Shape {
    private  double heigth;
 public Sequare(double heigth, int color) {
        super(color);
        this.heigth = heigth;
    }
    @Override
    public double getArea() {
        return heigth*heigth;
    }

    @Override
    public String toString() {
        return "Sequare{" + "heigth=" + heigth + '}' ;
        
    }
    
}
