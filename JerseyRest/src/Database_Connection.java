import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Database_Connection {
    public static Connection connect(){
        try {
            InputStream is=JdbcInsert.class.getClassLoader().getResourceAsStream("database.properties");
            Properties prop=new Properties();
            prop.load(is);
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(prop.getProperty("db_url"),prop.getProperty("username"), prop.getProperty("password"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
}
