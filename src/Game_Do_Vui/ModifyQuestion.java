/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Do_Vui;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ModifyQuestion {
    
    public static List<Question> GetQuestionList() {
        List<Question> QuestionList = new ArrayList<>();
        FileInputStream fin = null;
        InputStreamReader inp = null;
        BufferedReader buf = null;

        try {
            fin = new FileInputStream("Question.txt");
            inp = new InputStreamReader(fin, StandardCharsets.UTF_8);
            buf = new BufferedReader(inp);

            String line;

            while ((line = buf.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                Question question = new Question();
                question.Parse(line);
                QuestionList.add(question);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifyQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ModifyQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException ex) {
                    Logger.getLogger(ModifyQuestion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (inp != null) {
                try {
                    inp.close();
                } catch (IOException ex) {
                    Logger.getLogger(ModifyQuestion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (buf != null) {
                try {
                    buf.close();
                } catch (IOException ex) {
                    Logger.getLogger(ModifyQuestion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
          return QuestionList;
    }
    
    public static List<Question> GetList(){
        List<Question> List1 = ModifyQuestion.GetQuestionList();
        Question question = new Question();
        List<Question> List= new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            int a = ran.nextInt(0, List1.size()-1);
            question = List1.get(a);
            List.add(question);
            List1.remove(a);
            
        }
        
        
        return List;
    }
    
}
