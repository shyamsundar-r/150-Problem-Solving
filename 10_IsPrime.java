import java.util.*;
class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=2;i<=n;i++){
            if(n%i==0) c++;
        }
        if(c==1) System.out.println(n+" is a Prime Number");
        else System.out.println(n+" is not a Prime Number");
        sc.close();
    }
}
