/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Business;
import L_Entity.E_User;
import L_Entity.Interface.I_User;
import L_Persintence.P_User;
import java.util.ArrayList;

/**
 *
 * @author jean
 */
public class B_User implements I_User {
        private P_User P_User;
    
    public B_User() {
       P_User = new P_User();
    }

    @Override
    public void InsertUser(E_User User) {
        this.P_User.InsertUser(User);
    }

    @Override
    public void UpdateUser(int UserId, E_User User) {
         this.P_User.UpdateUser(UserId, User);
    }

    @Override
    public void DeleteUser(int UserId) {
       this.P_User.DeleteUser(UserId);
    }

    @Override
    public ArrayList<E_User> GetAllUsers() {
       return this.P_User.GetAllUsers();
    }

    @Override
    public int LoginUser(E_User User) {
      return this.P_User.LoginUser(User);
    }
    
}
