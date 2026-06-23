import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m%n==0) System.out.println(n+" is a Exact Multiple of "+m);
        else System.out.println(n+" is not a Exact Multiple of "+m);
    }
    
}
