package DB;

import java.sql.*;

public class Insert {
    String databaseName = "aplicatiebancara";
    String url = "jdbc:mysql://localhost:3307/"+databaseName;
    String username = "root";
    String password = "";

    public void insert(String nameDB,int id, double commission, String name, int month, int year, int cod, double commission_standard) throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "insert into nameDB ="+ nameDB + " value(id_card, name_card, month_card, year_card, cod, commission_standard, commission) " +
                      "("+ id + "," + name+ "," + month +"," + year + "," + cod + ","  + commission_standard + "," + commission + ");";
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
