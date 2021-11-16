import java.sql.*;
public class Validate {
	public static boolean checkUser(String account,String password) 
    {
        boolean st = false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql:/ /localhost:3306/test","root","studytonight");
            PreparedStatement ps = con.prepareStatement("select * from register where username=? and password=?");
            ps.setString(1, account);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}
