package WarmUpAndPractices.day44;
/*Create a class called Rectangle
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
public class Rectangular {
    double length;
    double witdh;
    public Rectangular(double length,double witdh){
        this.length=length;
        this.witdh=witdh;

    }
    public double area(){
        return length*witdh;
    }

    public double perimeter(){
        return (length*2)+(witdh*2);
    }

    public String toString(){
        return "length: "+length+" width: "+witdh+" area: "+area()+" perimeter: "+perimeter();
    }
}
