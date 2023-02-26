/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Do_Vui;

/**
 *
 * @author Admin
 */
public class UserData {
    String UserName;
    int HighScore;
    int Score;

    public UserData() {
    }

    public UserData(String UserName) {
        this.UserName = UserName;
    }

    public UserData(String UserName, int HighScore) {
        this.UserName = UserName;
        this.HighScore = HighScore;
    }

  

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public int getHighScore() {
        return HighScore;
    }

    public void setHighScore(int HighScore) {
        this.HighScore = HighScore;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
    
    
}
