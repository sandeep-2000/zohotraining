import javax.swing.*;
import java.sql.*;
import java.lang.*;
public class JdbcInsert {
    public static void main(String args[]){
        Student_Data data=new Student_Data();
        //Student s1=data.getStudent(430);
        Student_s s2=new Student_s();
        s2.id=443;
        s2.name="Prudvi";
        s2.address="Erra light Kompa";
        s2.age=34;
        s2.salary=40;
        data.connect();
        data.add_details(s2);
        //System.out.println(s1.name);

    }
}
class Student_Data{
    Connection con=null;
    String host = "localhost";
    String port = "5432";
    String db_name = "postgres";
    String username = "postgres";
    String password = "Aloney@311220-";
    public void connect(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + db_name + "", "" + username + "", "" + password + "");
        } catch (Exception e) {
            System.out.println(e);
        }

    }



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
    public void add_details(Student_s s){
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
