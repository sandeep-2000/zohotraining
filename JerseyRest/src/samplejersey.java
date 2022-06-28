import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.lang.*;
import java.util.Properties;

public class samplejersey {
    public static void main(String args[]) {

        int id=1244;
        int age=98;
        String name="latha";
        String place="medak";

        String query = "insert into \"sampleTable\" values(?,?,?,?)";
        try {
            Connection con=Database_Connection.connect();
            if (con != null) {
                System.out.println("Connection Ok");
                PreparedStatement st = con.prepareStatement(query);
                st.setInt(1,id);
                st.setString(2,name);
                st.setString(3,place);
                st.setInt(4,age);
                int up = st.executeUpdate();
//                while (rs.next()) {
//                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
//                }

                st.close();
                System.out.println(up);
            }
            else {
                System.out.println("Connection Failed");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}