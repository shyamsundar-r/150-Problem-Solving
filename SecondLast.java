//Return second last digit of given number  : 
import java.util.*;
public class SecondLast {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int res = (n/10)%10;
     System.out.println("Second Last Digit is "+res);   
    }
}

