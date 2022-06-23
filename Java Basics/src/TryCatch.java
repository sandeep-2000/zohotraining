import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class TryCatch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName()+": / by zero");
        }
    }
}
