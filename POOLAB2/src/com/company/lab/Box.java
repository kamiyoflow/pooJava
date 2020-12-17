package com.company.lab;

import java.sql.SQLOutput;

class Box {

    private static int height, width, depth, value=1;
    public Box() {
        this.height = value;
        this.width = value;
        this.depth = value;

    }

    public Box(int value) {
        this.height = value;
        this.width = value;
        this.depth = value;
    }


    public Box(int height, int depth, int width){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }




    public int Surface(){

       int surf = Box.height * Box.width;
        System.out.println("Surface is: " + surf);
    return surf;


    }
    public int Volume(){

        int vol = Box.height * Box.width * Box.depth;
        System.out.println("Volume is: " + vol);
        return vol;


    }
    public static void Param() {
        System.out.println("Height is: " + Box.height);
        System.out.println("Depth is: " + Box.depth);
        System.out.println("Width is: " + Box.width);
    }
}


