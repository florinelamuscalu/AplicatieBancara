package DB;


import java.sql.*;

public class LoadDB {
   public static String databaseName = "aplicatiebancara";
   public static String url = "jdbc:mysql://localhost:3307/"+databaseName;
   public static String username = "root";
   public static String password = "";

    public void loadDBcard() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "select * from card";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){
                System.out.println(res.getInt("id_card"));
                System.out.println(res.getString("name_card"));
                System.out.println(res.getInt("month_card"));
                System.out.println(res.getInt("year_card"));
                System.out.println(res.getInt("cod"));
                System.out.println(res.getInt("commission_standard"));
                System.out.println(res.getInt("commission"));
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadDBconturi() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "select * from conturi";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){
                System.out.println(res.getInt("id_cont"));
                System.out.println(res.getString("name_cont"));
                System.out.println(res.getString("cnp"));
                System.out.println(res.getInt("suma"));
                System.out.println(res.getInt("soldMin"));
                System.out.println(res.getInt("dobanda"));
                System.out.println(res.getInt("zi"));
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadDBcredit() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "select * from credit";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){
                System.out.println(res.getInt("id_credit"));
                System.out.println(res.getString("name_credit"));
                System.out.println(res.getInt("venit"));
                System.out.println(res.getInt("suma"));
                System.out.println(res.getInt("dobanda"));
                System.out.println(res.getInt("perioada"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadDBTransfer() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "select * from transfer";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){
                System.out.println(res.getInt("id_transfer"));
                System.out.println(res.getInt("sumaTras"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
