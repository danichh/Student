/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Random;

/**
 *
 * @author danichh
 */
public class Rectangular {
    private int width; 
    private int lenght;
    private String color; 

    public Rectangular() {
        Random rand = new Random(); 
        this.width = rand.nextInt(10)+ 1;
        this.lenght = rand.nextInt(10)+ 1;
        this.color = "black"; 
    }
    
    public Rectangular(int width, int lenght, String color) {
        this.width = width;
        this.lenght = lenght;
        this.color = color; 
    }
    
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.lenght = rectangular.lenght;
        this.color = rectangular.color; 
    }
    /** 
     * to calculate the area of a rectangular 
     * @return the area of a rectangular
     */
    public int calcArea(){
        return width * lenght; 
        
    }
    
    /**
     * to calculate the perimeter of the rectangular
     * @return the perimeter of the rectangular
     */
    public int calcPerimeter(){
        return (width + lenght) * 2; 
    }
    
     public boolean equal (Rectangular rectangular){
         return this.width == rectangular.width && 
                 this.lenght == rectangular.lenght && 
                 this.color.equals(rectangular.color);       
     }

    @Override
    public String toString() {
        String str = ""; 
        str += String.format("%-10s: %d\n","Lenght:", lenght);
        str += String.format("%-10s: %d\n","Width", width);
        str += String.format("%-10s: &s\n", "Color", color);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimater", calcPerimeter());
        return str; 
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
      
    
}
