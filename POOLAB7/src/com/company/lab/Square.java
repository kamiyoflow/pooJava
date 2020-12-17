package com.company.lab;

 class Square extends Figure {
    int Area = 25;
    int Perimeter = 20;
    int getArea(){
        return Area;
    }
    int getPerimeter(){
        return Perimeter;
    }


     @Override
     public String toString() {
         return "Square";
     }
     }

