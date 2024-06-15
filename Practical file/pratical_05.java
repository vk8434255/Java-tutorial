import java.util.Scanner;

class rectangle{
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length");
        float lenght=s.nextFloat();
        System.out.println("Enter width");
        float width=s.nextFloat();
        System.out.println("area of rectangle:"+lenght*width);
        s.close();
    }
}
class circle extends rectangle{
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius=s.nextFloat();
        System.out.println("area of circle:"+3.14*radius*radius);
        s.close();
    }
}
class triangle extends circle{
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter height of triangle: ");
        float height=s.nextFloat();
        System.out.println("Enter Base of triangle: ");
        float base=s.nextFloat();
        System.out.println("area of triangle:"+0.5*height*base);
        s.close();
    }
}

public class pratical_05 { 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("find area of rectangle press:1\nfind area of circle press:2\nfind area of triangle press:3");
        System.out.println("choose operation:");
        int n=s.nextInt();
        
        switch(n){
            case 1:
            rectangle r=new rectangle();
            r.area();
            break;
            case 2:
            circle c=new circle();
            c.area();
            break;
            case 3:
            triangle t=new triangle();
            t.area();
            break;
            default:
            System.out.println("Incorrect option");
        }
        s.close();
    } 
}
