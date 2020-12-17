package com.company.lab;
import java.util.List;

public class FigureController  {
    void getMaxArea(List<Figure> array){
        int biggest = -1;
        int ind = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getArea() > biggest){
                biggest = array.get(i).getArea();
                ind = i;
            }
        }
        System.out.println("Figure with max area is: " + array.get(ind).toString() + " with value " + biggest);
    }

    void getMaxPerimeter(List<Figure> array){
        int biggest = -1;
        int ind = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getPerimeter() > biggest){
                biggest = array.get(i).getPerimeter();
                ind = i;
            }
        }
        System.out.println("Figure with max perimeter is: " + array.get(ind).toString() + " with value " + biggest);
    }
}


