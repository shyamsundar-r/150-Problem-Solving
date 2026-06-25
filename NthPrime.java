import java.util.*;
class NthPrime{
    public static boolean isPrime(int n){
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n>0){
            i++;
            if(isPrime(i)) n--;
        }
        System.out.println(i);
    }
}