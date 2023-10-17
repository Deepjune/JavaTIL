package jdbc;

import java.sql.*;

public class SQLSelectTest {
    public static Connection makeConnection(){
        String url = "jdbc:mysql://218.238.17.22:3306/jdbc";
        String id ="admin";
        String password = "626462";
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 적재 성공");
            con = DriverManager.getConnection(url, id, password);
            System.out.println("데이터베이스 연결 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = makeConnection();
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            while(rs.next()){
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                System.out.println(id+" "+title);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
