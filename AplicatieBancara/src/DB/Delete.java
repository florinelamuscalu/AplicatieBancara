package DB;

import java.sql.*;

public class Delete {
    public static String databaseName = "aplicatiebancara";
    public static String url = "jdbc:mysql://localhost:3307/"+databaseName;
    public static String username = "root";
    public static String password = "";

    public void DeleteDB (int id){
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "delete from card where id="+ id +";";
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
