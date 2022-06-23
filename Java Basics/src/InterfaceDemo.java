interface Writer{
    void write();

}
class pen implements Writer{
    @Override
    public void write() {
        System.out.println("pen");
    }
}
class pencil implements Writer{
    @Override
    public void write() {
        System.out.println("pencil");
    }
}
class kit{
    public void doSomething(Writer p){
        p.write();
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
        kit k=new kit();
        Writer p=new pen();
        Writer pc=new pencil();
        k.doSomething(pc);
    }
}
