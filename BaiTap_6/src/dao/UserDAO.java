package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    @Override
    public int insert(User t) {
        int ketQua = 0;
        try {
            Connection con = JDBCCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "INSERT INTO user(username, password, hoVaTen) " +
                         "VALUES ('" + t.getUsername() + "','" + t.getPassword() + "','" + t.getHovaTen() + "')";

            ketQua = st.executeUpdate(sql);

            System.out.println("Ban Da Thuc Thi: " + sql);
            System.out.println("Co: " + ketQua + " dong bi thay doi");

            JDBCCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(User t) {
        int ketQua = 0;
        try {
            Connection con = JDBCCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "UPDATE user " +
                         "SET password='" + t.getPassword() + "', " +
                         "hoVaTen='" + t.getHovaTen() + "' " +
                         "WHERE username='" + t.getUsername() + "'";

            ketQua = st.executeUpdate(sql);

            System.out.println("Ban Da Thuc Thi: " + sql);
            System.out.println("Co: " + ketQua + " dong bi thay doi");

            JDBCCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(User t) {
        int ketQua = 0;
        try {
            Connection con = JDBCCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "DELETE FROM user WHERE username='" + t.getUsername() + "'";

            ketQua = st.executeUpdate(sql);

            System.out.println("Ban Da Thuc Thi: " + sql);
            System.out.println("Co: " + ketQua + " dong bi thay doi");

            JDBCCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<User> selectAll() {
        ArrayList<User> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hoVaTen = rs.getString("hoVaTen");

                User u = new User(username, password, hoVaTen);
                ketQua.add(u);
            }

            JDBCCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public User selectById(User t) {
        User ketQua = null;
        try {
            Connection con = JDBCCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE username='" + t.getUsername() + "'";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hoVaTen = rs.getString("hoVaTen");

                ketQua = new User(username, password, hoVaTen);
            }

            JDBCCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        ArrayList<User> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE " + condition;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hoVaTen = rs.getString("hoVaTen");

                User u = new User(username, password, hoVaTen);
                ketQua.add(u);
            }

            JDBCCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
}
