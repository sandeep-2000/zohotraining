import javax.swing.*;
import java.io.InputStream;
import java.sql.*;
import java.lang.*;
import java.util.Properties;

public class JdbcInsert {
    private static Connection con;
    public static void main(String args[]){
        Student_Data data=new Student_Data();
        //Student s1=data.getStudent(430);
        Student_s s2=new Student_s();
        s2.id=401;
        s2.name="HERO";
        s2.address="chennai";
        s2.age=38;
        s2.salary=45675;
        con = Database_Connection.connect();
        data.add_details(con, s2);
        //System.out.println(s1.name);

    }
}
class Student_Data{




    //    public Student getStudent(int id) {
//        try {
//            //String query="select name from student where id="+id;
//
//
//            Student s = new Student();
//            s.id = id;
//
//            if(con!=null) {
//                Statement st = con.createStatement();
//                ResultSet rs = st.executeQuery(query);
//                rs.next();
//                s.name = rs.getString(1);
//
//
//                return s;
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        return null;
//    }
    public void add_details(Connection con, Student_s s){
        String query="insert into student values(?,?,?,?,?)";
        PreparedStatement st;
        try{
            st=con.prepareStatement(query);
            st.setInt(1,s.id);
            st.setString(2,s.name);
            st.setInt(3,s.age);
            st.setString(4,s.address);
            st.setInt(5,s.salary);
            st.executeQuery();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
class Student_s{
    int id,age,salary;
    String name,address;

}