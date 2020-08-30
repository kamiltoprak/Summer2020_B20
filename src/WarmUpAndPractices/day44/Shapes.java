package WarmUpAndPractices.day44;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

/*create a class called Shapes:
        create an arraylist of circle and add 5 objects of circle
        find out the circles that has max and min area
        create a an arraylist of rectangle and add 5 objects of rectangle
        find out the rectangles that has max and min area*/
public class Shapes {
    public static void main(String[] args) {
        Circle circle1=new Circle(5,10);
        Circle circle2=new Circle(10,20);
        Circle circle3=new Circle(7.5,15);
        Circle circle4=new Circle(6,12);
        Circle circle5=new Circle(7,14);

        ArrayList<Circle> circleList=new ArrayList<>();
        circleList.addAll(Arrays.asList(circle1,circle2,circle3,circle4,circle5));
        System.out.println(circleList);
        double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;
        for (Circle each:circleList) {
            if(each.area()>max){
                max=each.area();
            }
            if(each.area()<min){
                min=each.area();
            }

        }
        System.out.println(" Max  area  of  circle: "+ max);
        System.out.println(" Min  area  of  circle: "+ min);

        Rectangular rect1=new Rectangular(15,10);
        Rectangular rect2=new Rectangular(25,15);
        Rectangular rect3=new Rectangular(45,14);
        Rectangular rect4=new Rectangular(5,14);
        Rectangular rect5=new Rectangular(25,14);


        ArrayList<Rectangular> rectList=new ArrayList<>();
        rectList.addAll(Arrays.asList(rect1,rect2,rect3,rect4,rect5));
        System.out.println(circleList);
        double maxR=Integer.MIN_VALUE;
        double minR=Integer.MAX_VALUE;
        for (Circle each:circleList) {
            if(each.area()>maxR){
                maxR=each.area();
            }
            if(each.area()<minR){
                minR=each.area();
            }

        }
        System.out.println(" Max  area  of  Rectangular: "+ max);
        System.out.println(" Min  area  of  Rectangular: "+ min);

    }


}
