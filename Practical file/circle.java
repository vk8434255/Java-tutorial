package claculatearea;

import java.util.Scanner;

public class circle{
    public void area() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius=s.nextFloat();
        System.out.println("area of Circle:"+3.14*radius*radius);
        s.close();
    }
}