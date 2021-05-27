package DB;

import java.sql.*;

public class Update {
    String databaseName = "aplicatiebancara";
    String url = "jdbc:mysql://localhost:3307/"+databaseName;
    String username = "root";
    String password = "";

    public void updateCard(int id, double commission) throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "update card set commission="+ commission +" where id_card="+id+";";
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
