//Return last digit of the given number : 
import java.util.*;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n%10;
        System.out.println("Last Digit of the Number is "+result);
        sc.close();
    }
    
}
