class staff{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class GetterSetter {
    public static void main(String args[]){
        staff obj=new staff();
        obj.setId(2);
        obj.setName("hello");
        //obj.name="sandeep";
//        System.out.println(obj.getId());
//        System.out.println(obj.getName());
        obj.setName("sandeep");
        obj.setId(7);
        System.out.println(obj.getId());
        System.out.println(obj.getName());

    }
}
