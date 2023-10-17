package jdbc;

import java.sql.*;

public class SQLInsertTest {
    public static Connection makeConnection() {
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

    public static void main(String[] args) {
        addBook(5,"Artificia Intellegence", "Addison Wesley", "2002", 35000);
    }

    private static void addBook(int book_id,String title, String publisher, String year, int price) {
        Connection con = makeConnection();
        try {
            Statement stmt = con.createStatement();
            String s = String.format("INSERT INTO books(book_id,title,publisher, year, price) VALUES('%d','%s','%s','%s','%d')",book_id, title, publisher, year, price);
            System.out.println(s);
            int i = stmt.executeUpdate(s);
            if(i == 1)
                System.out.println("레코드 추가 성공");
            else
                System.out.println("레코드 추가 실패");
        } catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
}
