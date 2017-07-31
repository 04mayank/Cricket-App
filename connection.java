package cricin;
import java.sql.*;

public class connection {
  static Connection con;
  public void connect()
  {
       try {
         Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cric_score", "root", "mayank");
       }
       
       catch(Exception ee){System.out.println(ee);}
}

}
