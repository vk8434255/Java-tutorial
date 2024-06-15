import claculatearea.*;
import java.util.*;
public class usingpack {
    public static void main(String[] args) {
        System.out.println("1.Area of rectangle");
        System.out.println("2.Area of triangle");
        System.out.println("3.Area of circle");

        System.out.println("Enter your choice: ");
        Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        switch (c) {
            case 1:
                claculatearea.rectangle r=new claculatearea.rectangle();
                r.area();
                break;
            
            case 2:
                claculatearea.triangle t=new claculatearea.triangle();
                t.area();
                break;

            case 3:
                claculatearea.circle ci=new claculatearea.circle();
                ci.area();
                break;

            default:
                System.out.println("Enter wrong option try again");
                break;
        }
        
    }
}
