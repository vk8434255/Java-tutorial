import java.util.Scanner;
class area{
    float calculatearea(float l, float w){
        return(l*w);
    }
    float calculatearea(float h,float b,float a){
        return(a*b*h);
    }

    float calculatearea(float r){
        float pi=3.14f;
        return(r*pi*r);
    }    
}
public class pratical_03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float lenght,width,height,base,half,radius;
        area a=new area();
        System.out.println("find area of rectangle press:1\nfind area of circle press:2\nfind area of triangle press:3");
        System.out.println("choose operation:");
        int n=s.nextInt();
        switch(n){
            case 1:
            System.out.println("Enter a lenght of rectangle:");
            lenght=s.nextFloat();
            System.out.println("Enter a width of rectangle:");
            width=s.nextFloat();
            System.out.println("the area of rectangle is :"+a.calculatearea(lenght, width));
            break;
            case 2:
            System.out.println("Enter a radius of circule:");
            radius=s.nextFloat();
            System.out.println("the area of circlue is :"+a.calculatearea(radius));
            break;
            case 3:
            System.out.println("Enter a height of triangle:");
            height=s.nextFloat();
            System.out.println("Enter a Base of triangle:");
            base=s.nextFloat();
            half=0.5f;
            System.out.println("the area of triangel is:"+a.calculatearea(height, base, half));
            break;
            default:
            System.out.println("Incorrect option");
        }
        s.close();
    }
}
