import java.util.*;
class A{
    public A(){
        System.out.println("in A");

    }
    public A(int n){
        System.out.println(n*2);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }

    public B(int n){
        super(n);
        System.out.println(n*3);
    }
}
public class SuperDemo {
    public static void main(String args[]){
        B obj =new B(6);

    }
}
