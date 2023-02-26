/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Do_Vui;

/**
 *
 * @author Admin
 */
public class users {
    String UserName, Email, PassWord;
    int Role,Active;

    public users() {
    }

    public users(String UserName, String Email, String PassWord, int Role) {
        this.UserName = UserName;
        this.Email = Email;
        this.PassWord = PassWord;
        this.Role = Role;
        
    }

    public users(String UserName, String Email, String PassWord, int Role, int Active) {
        this.UserName = UserName;
        this.Email = Email;
        this.PassWord = PassWord;
        this.Role = Role;
        this.Active = Active;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int Active) {
        this.Active = Active;
    }
    
    
}
