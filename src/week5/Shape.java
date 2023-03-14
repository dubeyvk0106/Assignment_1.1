package week5;

import java.lang.*;

abstract class Shape {

    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double perimeter(){
        return 2* Math.PI*radius;
    }

    double area(){
        return Math.PI*radius*radius;

    }
}

class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double perimeter(){
        return 2*(length + breadth);

    }

    double area(){
        return (length*breadth);

    }
}

class testing{

    public static void main(String args[]){
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(10, 5);

        System.out.println(c.perimeter());
        System.out.println(c.area());
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}
