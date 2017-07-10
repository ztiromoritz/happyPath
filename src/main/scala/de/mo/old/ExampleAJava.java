package de.mo.old;


import java.util.ArrayList;
import java.util.List;

public class ExampleAJava {

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args){

        //========================================

        List<Point> points = new ArrayList<>(100);
        for(int x=0;x<10;x++){
            for(int y=0;y<10;y++){
                points.add(new Point(x,y));
            }
        }


        //=========================================

        System.out.println(points);
    }
}
