/*Develop java program which has (only) class CircleDemo that has members - radius,area,and perimeter.Include methods to do the following.
a. accept the radius from user
b. find the area of the circle
c. find the perimeter of the circle
d. display all the details*/

import java.util.Scanner;
public class circledemo{
    Scanner sc = new Scanner(System.in);
    double r;
    static double area,perimeter;

    void accept(){
        System.out.println("ENTER RADIUS OF CIRCLE");
        r = sc.nextDouble();
    }

      double a(){
         area = (3.14 * r * r);
         return area;
    }
     double p(){
        perimeter = (2 * 3.14 * r);
        return perimeter;
    }

    public static void main(String[] ss){

        Scanner sc = new Scanner(System.in);
        circledemo c1 = new circledemo();
        c1.accept();
        c1.a();
        c1.p();
        System.out.println("CALCULATED DETAILS");
        System.out.println("AREA :"+circledemo.area);
        System.out.println("PERIMETER :"+circledemo.perimeter);

    }
}
