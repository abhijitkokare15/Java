import java.sql.*;
public class Jdbc1 {

    public static void main() throws Exception
    {
        String uri="jdbc:mysql://localhost:3306/studentdb";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(uri,uname,pass);
        Statement st = con.createStatement();
       
        ResultSet rs =  st.executeQuery("select * from student");
        rs.next();

        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));

    }
    
}
