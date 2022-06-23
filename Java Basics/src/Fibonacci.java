import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1;
        int f3=f1+f2;
        for(int i=2;i<n;i++){
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            f3=f1+f2;
//            System.out.print(" "+f3);
        }
    }
}
