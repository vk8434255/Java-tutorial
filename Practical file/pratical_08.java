import java.util.StringTokenizer;

public class pratical_08 {
    public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("I am Vikash kumar ");  
    while (st.hasMoreTokens()) {  
        System.out.println(st.nextToken());  
    }  
   }  
}