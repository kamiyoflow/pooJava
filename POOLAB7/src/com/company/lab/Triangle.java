package com.company.lab;

class Triangle extends Figure {
    int Area = 17;
    int Perimeter = 23;
    int getArea(){
        return Area;
    }
    int getPerimeter(){
        return Perimeter;
    }
    @Override
    public String toString() {
        return "Triangle";
    }
}
