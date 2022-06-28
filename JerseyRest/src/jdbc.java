import javax.swing.*;
import java.sql.*;
import java.lang.*;
public class jdbc {
    public static void main(String args[]){
        StudentData data=new StudentData();
        Student s1=data.getStudent();
        System.out.println(s1.name);

    }
}
class StudentData{
    public Student getStudent() {
        try {
            String query="select * from student";
            String host = "localhost";
            String port = "5432";
            String db_name = "postgres";
            String username = "postgres";
            String password = "Aloney@311220-";

            Student s = new Student();
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + db_name + "", "" + username + "", "" + password + "");
            if(con!=null) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    System.out.println("||"+rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getInt(3)+"||"+rs.getString(4)+"||"+rs.getInt(5)+"||");
                }


                return s;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
class Student{
    int id;
    String name;

}
