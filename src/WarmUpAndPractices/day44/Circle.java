package WarmUpAndPractices.day44;
/* 1. Create a class called Circle
        variables:
        radius, pi, diameter
        add a constructor that can initialize the radius of the circle
        instance methods:
        area(): can return the area of the circle as double
        perimeter(): cna return the perimeter of the circle as double
        toString(): returns the info of the circle

        Create a class called Rectangle
        instance variables:
        length, width
        add a constructor that initialize the fileds
        instance methods:
        area(): can return the area of the rectangle as double
        perimeter(): cna return the perimeter of the rectangle as double
        toString(): returns the info of the rectangle objects
        create a class called Shapes:
        create an arraylist of circle and add 5 objects of circle
        find out the circles that has max and min area
        create a an arraylist of rectangle and add 5 objects of rectangle
        find out the rectangles that has max and min area*/
public class Circle {
    double radius;
    static double pi;
    double diameter;

    static{
        pi=3.14;
    }
    public Circle(double radius,double diameter){
        this.radius=radius;
        this.diameter=diameter;
    }

    public double  area(){
        return radius*radius*pi;
    }

    public double  primeter(){
        return diameter*pi;
    }

    public String toString(){
        return "\nradius: "+radius+ "\n Area: "+area()+"\n Perimeter "+primeter();
    }
}
