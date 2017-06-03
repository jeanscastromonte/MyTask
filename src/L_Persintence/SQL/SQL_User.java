/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Persintence.SQL;

/**
 *
 * @author jean
 */
public class SQL_User {
    
    // <editor-fold defaultstate="collapsed" desc="SQL_PARAMETER">
    public static final String UserId="_UserId";
    public static final String UserName="_UserName";
    public static final String UserPassword="_UserPassword";
    public static final String UserStatus="_UserStatus";
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="SQL_SP">
    public static final String LoginUser="{CALL SP_LoginUser(?,?)}";
    public static final String InsertUser="{CALL SP_InsertUser(?,?,?)}";
    public static final String UpdateUser="{CALL SP_UpdateUser(?,?,?,?)}";
    public static final String DeleteUser="{CALL SP_DeleteUser(?)}";
    public static final String GetAllUsers="{CALL SP_GetAllUsers}";
    //</editor-fold>
}
