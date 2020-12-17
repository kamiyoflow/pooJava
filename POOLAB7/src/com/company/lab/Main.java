package com.company.lab;
import java.util.ArrayList;
import java.util.List;

class Circle extends Figure{
    int area = 200;
    int perimeter = 1;

    int getArea(){
        return area;
    }

    int getPerimeter(){
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}

public class Main {

    public static void main(String[] args) {
        Figure sq = new Square();
        Figure rect = new Rectangle();
        Figure tri = new Triangle();

        List<Figure> figureArray = new ArrayList<Figure>();

        figureArray.add(sq);
        figureArray.add(rect);
        figureArray.add(tri);

        FigureController controller = new FigureController();
        controller.getMaxArea(figureArray);
        controller.getMaxPerimeter(figureArray);

        System.out.println("Circle area: " +new Circle().getArea());
        System.out.println("Circle perimeter: "+new Circle().getPerimeter());

        figureArray.add(new Circle());
        controller.getMaxArea(figureArray);
        controller.getMaxPerimeter(figureArray);


    }
}