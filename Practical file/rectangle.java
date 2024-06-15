package claculatearea;

import java.util.*;

public class rectangle {
    public void area() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length");
        float lenght=s.nextFloat();
        System.out.println("Enter width");
        float width=s.nextFloat();
        System.out.println("area of rectangle:"+lenght*width);
        s.close();
    }
}
