package jdbc;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/universty";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection conn = null;


        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            conn.setAutoCommit(false);

            PreparedStatement pr = conn.prepareStatement("INSERT INTO students (student_name, student_class) vALUES (?,?)");
            pr.setString(1, "John");
            pr.setInt(2, 1);
            pr.executeUpdate();

            if (1==1) {
                throw new SQLException();
            }
            pr.setString(1, "Doe");
            pr.setInt(2, 4);
            pr.executeUpdate();
            conn.commit();

            pr.close();
            conn.close();

        } catch (SQLException e) {
            if(conn!=null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.getStackTrace();
                }
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("SQLState : " + e.getSQLState());
                System.out.println("VendorError : " + e.getErrorCode());
            }

        }
    }
}
