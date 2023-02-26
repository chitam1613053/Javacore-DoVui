/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Do_Vui;

/**
 *
 * @author Admin
 */
public class Question {
    String title, Option1,Option2,Option3,Option4,Answer;
    

    public Question() {
    }

  
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String Option1) {
        this.Option1 = Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String Option2) {
        this.Option2 = Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String Option3) {
        this.Option3 = Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public void setOption4(String Option4) {
        this.Option4 = Option4;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

 
    
    public void Parse(String line){
        String [] paramater;
        paramater = line.split(", ");
        title = paramater[0];
        Option1 = paramater[1];
        Option2 = paramater[2];
        Option3 = paramater[3];
        Option4 = paramater[4];
        Answer = paramater[5];
    }
    
}
