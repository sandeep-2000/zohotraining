import java.util.*;
import java.lang.*;
import java.lang.Iterable;
public class CollectionsAndGenerics {
    public static void main(String args[]){
        Collection values=new ArrayList();
        values.add(4);
        values.add(8);
        values.add("sandeep");
        //System.out.println(values);
        Iterator i= values.iterator();
        while(i.hasNext()){
        System.out.println(i.next());}
        List lst=new ArrayList();
        lst.add(98);
        lst.add(34);
        lst.add(0,"sandep");
        for(int j=0;j< lst.size();j++){
            System.out.println(lst.get(j));
        }
        for(Object k:lst){
            System.out.println(k);
        }
        List<Integer> l=new ArrayList<>();
        l.add(87);
        l.add(6);
        l.add(5);
        Collections.sort(l);
        for(Object h:l) {
            System.out.println(h);
        }
        Set<Integer> s=new TreeSet<>();
        s.add(398);
        s.add(3);
        s.add(4);
        s.add(76);
        for(Object n:s){
            System.out.println(n);
        }
        Map<Integer,String> m=new HashMap<>();
        m.put(2,"sandeep");
        m.put(0,"hi");
        System.out.println(m);
        System.out.println("hello chane");



    }
}
