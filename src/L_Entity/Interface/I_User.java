/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Entity.Interface;

import java.util.ArrayList;
import L_Entity.E_User;

/**
 *
 * @author jean
 */
public interface I_User {
    
    public int LoginUser(E_User User);
    public void InsertUser(E_User User);
    public void UpdateUser(int UserId, E_User User);
    public void DeleteUser(int UserId);
    public ArrayList<E_User> GetAllUsers();
    
}
