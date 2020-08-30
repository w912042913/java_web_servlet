package com.nuesoft.cookie.dao.impl;
import com.nuesoft.cookie.dao.UserDao;
import com.nuesoft.cookie.domain.User;
import com.nuesoft.cookie.util.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserImpl implements UserDao {
    private Connection conn =null;
    private PreparedStatement pstmt =null;
    private ResultSet rs =null;
    private User user =null;
    @Override
    public User loginUser(User loginUser) {
            String sql = "select * from userlogin where userName = ? and password = ?";
            try{
                conn = JDBCUtils.getConnection();
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, loginUser.getUsername());
                pstmt.setString(2,loginUser.getPassword());
                rs = pstmt.executeQuery();
                while (rs.next()){
                    user = new User();
                    this.user.setUsername(rs.getString("username"));
                    this.user.setPassword(rs.getString("password"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JDBCUtils.close(rs, pstmt, conn);
            }
            return user;
    }
}
