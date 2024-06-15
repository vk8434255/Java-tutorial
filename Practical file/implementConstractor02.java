

class student1{
    int id;
    String first,last,dept;

    student1(int i, String n){
        id=i;
        dept=n;
    }
    student1(String f, String l){
        first=f;
        last=l;
    }
}

public class implementConstractor02 {
    public static void main(String[] args) {

        // Constructor overloading
        System.out.println("\nconstructor overloading execution\n");
        student1 s1=new student1(1322196,"BCA");
        System.out.println("Student id "+s1.id +" and dept:- " +s1.dept);

        student1 s2=new student1("Vikash","Kumar");
        System.out.println("student name:- "+s2.first +" "+ s2.last);
        
    }
    
}
