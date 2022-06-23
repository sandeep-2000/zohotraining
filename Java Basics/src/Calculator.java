import java.util.*;
class Calc{
    int num1;
    int num2;
    public Calc(){
        System.out.println("This is first default constructor");
        num1=45;
        num2=87;
    }
    public Calc(int x){
        System.out.println("This is second constructor");
        num1=x;
    }

    public int add(int a,int b){
        return a+b;

    }
    public int sub(int a,int b){
        return a-b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int mod(int a,int b){
        return a%b;
    }
    class inner{
        public void display(){
            System.out.println("hi i am innner class");
        }
    }

}
class CalcAdv extends Calc{
    public void lefts(int n){
        System.out.println(n>>2);
    }
    public void rights(int n){
        System.out.println(n<<2);
    }

}
class CalcAdvAdv extends CalcAdv{
    public void and(int n){
        System.out.println(n & 2);
    }
}

public class Calculator {
    public static void main(String args[]){
        CalcAdvAdv obj=new CalcAdvAdv();
    CalcAdvAdv.inner obj1=obj.new inner();
        obj1.display();
        System.out.println(obj.num1);
        int a=15;
        int b=4;
        System.out.println(obj.sub(a,b));
        obj.lefts(a);
        obj.rights(b);
        obj.and(a);
        System.out.println(obj.add(a,b));
        System.out.println(obj.div(a,b));
        System.out.println(obj.mod(a,b));
        System.out.println(obj.mul(a,b));
    }
}
