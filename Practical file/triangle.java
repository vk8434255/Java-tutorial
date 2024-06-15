package claculatearea;

import java.util.Scanner;

public class triangle {
    public void area() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter height of triangle: ");
        float height=s.nextFloat();
        System.out.println("Enter Base of triangle: ");
        float base=s.nextFloat();
        System.out.println("area of Triangle:"+0.5*height*base);
        s.close();
    }
}
