/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Persintence;
import L_Entity.Interface.I_User;
import L_Entity.E_User;
import L_Persintence.SQL.SQL_User;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author jean
 */
public class P_User implements I_User {
    
    private Connection cn = new P_Connection().getConnection();

    @Override
    public void InsertUser(E_User User) {
        try {
            CallableStatement statement = cn.prepareCall(SQL_User.InsertUser);
            statement.setString(SQL_User.UserName, User.getUserName());
            statement.setString(SQL_User.UserPassword, User.getUserPassword());
            statement.setBoolean(SQL_User.UserStatus, User.isUserStatus());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void UpdateUser(int UserId, E_User User) {
        try {
            CallableStatement statement = cn.prepareCall(SQL_User.UpdateUser);
            statement.setInt(SQL_User.UserId, UserId);
            statement.setString(SQL_User.UserName, User.getUserName());
            statement.setString(SQL_User.UserPassword, User.getUserPassword());
            statement.setBoolean(SQL_User.UserStatus, User.isUserStatus());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void DeleteUser(int UserId) {
        try {
            CallableStatement statement = cn.prepareCall(SQL_User.DeleteUser);
            statement.setInt(SQL_User.UserId, UserId);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<E_User> GetAllUsers() {
        
       ArrayList<E_User> Users = new ArrayList<E_User>();
        try {
            CallableStatement statement = cn.prepareCall(SQL_User.GetAllUsers);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                E_User User = new E_User();
                User.setUserId(resultSet.getInt(SQL_User.UserId));
                User.setUserName(resultSet.getString(SQL_User.UserName));
                User.setUserPassword(resultSet.getString(SQL_User.UserPassword));
                User.setUserStatus(resultSet.getBoolean(SQL_User.UserStatus));
                Users.add(User);
            }
            return Users;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public int LoginUser(E_User User) {
        
        int num = 0;
        try {
            CallableStatement statement = cn.prepareCall(SQL_User.LoginUser);
            statement.setString(SQL_User.UserName, User.getUserName());
            statement.setString(SQL_User.UserPassword, User.getUserPassword());
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()==true){
                num = 1;
            }
            return num;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return num;
        }
    }
    
}
