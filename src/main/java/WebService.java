import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WebService {
    public static void main(String[] args){
        PGConnect pgconn = new PGConnect();
        pgconn.runConnect();
    }
}
