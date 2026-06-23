import java.util.*;
class SumOfLastTwoDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n%10 + (n/10)%10;
        System.out.println("Sum of Last Two Digits is "+res);     
        sc.close();
    }
}
