
import java.util.Scanner;

class collage{
    String collage_name;
    
}
class dept extends collage{
    String dept_name;
}
class student extends dept{
    int roll_no;
    String name;
    void getdata(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter roll no: ");
        roll_no=Integer.parseInt(s.nextLine());
        
        System.out.print("Enter Name: ");
        name=s.nextLine();
        
        System.out.print("Enter Department Name: ");
        dept_name=s.nextLine();
        
        System.out.print("Enter Collage Name: ");
        collage_name=s.nextLine();
        s.close();
    }
    void display(){
        System.out.println("\nStudent roll no: "+roll_no);
        System.out.println("Student Name: "+name);
        System.out.println("Department Name: "+dept_name);
        System.out.println("Collage Name: "+collage_name);
    }
    
}

public class practical_04 {
    public static void main(String[] args) {
        student s=new student(); 
        s.getdata();
        s.display();  
    }
}
