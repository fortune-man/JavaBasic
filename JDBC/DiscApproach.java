package JDBC;

import java.io.*;
import java.sql.*;

public class DiscApproach {
//    public static void main(String[] args) {
//        Connection con = null;
//        try{
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            String url = "jdbc:oracle.thin:@localhost:1521:orcl";
//            String user = "scott";
//            String pass = "tiger";
//            con = DriverManager.getConnection(url, user, pass);
//            String sql = "insert into gallery (id, name, path) values (?,?,?)";
//            PreparedStatement pstmt = con.createStatement(sql);
//            pstmt.setInt(1, 1);
//            pstmt.setString(2,"Image 1");
//            File imageFile = new File("G://images//image_1.png");
//            FileInputStream fis = new FileInputStream(imageFile);
//            pstmt.setBinaryStream(3, fis, (int)imageFile.length());
//
//        } catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if(con != null){
//                try{
//                    con.close();
//                }catch (SQLException e) {e.printStackTrace();}
//            }
//        }
//    }

    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle.thin:@localhost:1521:orcl";
            String user = "scott";
            String pass = "tiger";
            con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from gallery where id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, 1);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                Blob blob = rs.getBlob(3);
                byte[] data = blob.getBytes(1, (int) blob.length());
                File imageFile = new File("G://images//image_1.png");
                FileOutputStream fos = new FileOutputStream(imageFile);
                fos.write(data);
                fos.close();
            }
        } catch (ClassNotFoundException | SQLException | IOException e) {
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
