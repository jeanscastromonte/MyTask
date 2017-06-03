/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Entity;

/**
 *
 * @author jean
 */
public class E_User {
    
    private int UserId;
    private String UserName;
    private String UserPassword;
    private boolean UserStatus;
    
    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public boolean isUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(boolean UserStatus) {
        this.UserStatus = UserStatus;
    }      
}
