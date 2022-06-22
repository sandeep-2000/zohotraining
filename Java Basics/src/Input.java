import java.util.*;
public class Input {
    public static void main(String args[]) throws Exception{
        Thread t1=new Thread(() ->{
            for(int i=0;i<5;i++){
                System.out.println("hello");
                try{Thread.sleep(1000);}catch (Exception e){};
            }
        },"my name is t1");
        Thread t2=new Thread(() -> {
            for(int i=0;i<5;i++){
                System.out.println("hi");
                try{Thread.sleep(1000);}catch (Exception e){};
            }
        },"my name is t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.getPriority());

        t1.start();
        try{Thread.sleep(10);}catch (Exception e){};
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println(t1.getName());
        System.out.println("complete");
    }
}
