package JDBC;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        Connection con = null;
        try{
            // 1. Load Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 2. Establish the Connection
            String url = "jdbc:oracle.thin:@localhost:1521:orcl";
            String user = "scott";
            String pass = "tiger";
            con = DriverManager.getConnection(url, user, pass);
            // 3. Create a Statement
            Statement stmt = con.createStatement();
            // 4. Execute a query
            String sql = "select * from emp";
            ResultSet rs = stmt.executeQuery(sql);
            // 5. Process the result as ResultSet
            while(rs.next()){
                String id = rs.getString("empno");
                String name = rs.getString("ename");
                System.out.println(id + " : " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(con != null){
                try{
                    con.close();
                }catch (SQLException e) {e.printStackTrace();}
            }
        }
    }
}
