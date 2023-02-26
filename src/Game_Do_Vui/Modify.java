/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Do_Vui;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Modify {
    public static String MD5Key = "!!!!!!Thong tin nay duoc bao mat!!!!!!!";
    public static String CurrentUserName;
    
    
    
    public static List<users> GetUserList(){
        List<users> UserList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "select * from uers";
            statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                users u = new users(result.getNString("UserName"), 
                                       result.getNString("Email"), 
                                    result.getNString("PassWord"), 
                                    result.getInt("Role"), 
                                    result.getInt("Acttive"));
                UserList.add(u);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        return UserList;
    }
    public static void InsertUser(users User){
         Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "INSERT INTO uers (UserName, Email, PassWord, Role) VALUES (?,?,?,?)";
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, User.getUserName());
            statement.setString(2, User.getEmail());
            statement.setString(3, User.getPassWord());
            statement.setInt(4, User.getRole());
            
            
            statement.execute();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        
    }
    public static void DeleteUser(String UserName){
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "DELETE FROM uers WHERE (UserName = ? )";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, UserName);
            
       
            
            statement.execute();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void UpdateUser(users User){
         Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "UPDATE `test`.`uers` SET `Acttive` = '1' WHERE (`UserName` = ?);";
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, User.getUserName());
          
            
            
            statement.execute();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
    }
    public static List<UserData> GetDataList(){
        List<UserData> UserDataList = new ArrayList<>();
         Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "select * from userdata";
            statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
               
                UserData data = new UserData(result.getNString("UserName"));
                UserDataList.add(data);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        return UserDataList;
        
    }
    public static void InsertUserData(UserData User){
         Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "INSERT INTO userdata (UserName) VALUES (?)";
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, User.getUserName());
         
            
            
            statement.execute();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        
    }
    public static void DeleteUserData(String UserName){
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "DELETE FROM userdata WHERE (UserName = ? )";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, UserName);
            
       
            
            statement.execute();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void UpdateUserData(UserData User){
         Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "UPDATE `test`.`userdata` SET `HighScore` = ? WHERE (`UserName` = ?);";
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(User.getHighScore()));
            statement.setString(2, User.getUserName());
          
            
            
            statement.execute();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
    }
    public static UserData GetData(String UserName){
       
         Connection conn = null;
        PreparedStatement statement = null;
        UserData data2 = new UserData();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tam123");
            String sql = "select * from userdata where UserName = ?";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, UserName);
            
            ResultSet result = statement.executeQuery();
            while(result.next()){
            data2 = new UserData(result.getNString("UserName"),result.getInt("HighScore"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }  
        
        return data2;
        
    }
}
