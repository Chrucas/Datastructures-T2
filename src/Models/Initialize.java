/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Random;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Erik
 */
public class Initialize {



    // creates an array of students with empty fields
    
        
    static Double mkGrd() {

        Random ran = new Random();    
        double grade = (ran.nextInt(9)+1)+ran.nextDouble()*10+1;
        grade = ran.nextDouble()*10+1;
        return grade;
        
    }
    
    

    public static void setStudents(Student[]S){
        double GroupNr = (((S.length/4.0)/32.0));
        
        int groupNmr = (int) Math.ceil(GroupNr*4.0);
        String[]groups = new String[groupNmr];
        String[] fieldsOfStudy = new String[]{"G", "N", "S", "T"};
    
    
        int grp = groupNmr/4;
        for(int i = 0;i<S.length;i++){
            S[i]= new Student();    
        }
        for(int i=0, j=1;i<groups.length;i++){
            if(i+1>j*4){
                j++;
            }
            groups[i] = "I" + fieldsOfStudy[i%4] +"2"+(grp<=9?"0"+j:j);
        }
        for (int i=0; i<S.length; i++) {
           
            double d = mkGrd();
            S[i].setGrade(d);
            S[i].setStudentNumber(50060001);
            S[i].setGroup(groups[i%groups.length]);
        }
        
            
            
        for(int i=0;i<S.length;i++){
            S[i].setStudentNumber(S[i].getStudentNumber()+i);
        }
        
        Collections.shuffle(Arrays.asList(S));
    }
    public static void print(Student[]S){
        for(int i=0;i<S.length;i++){
            System.out.println(S[i]);
        }
    }
}    
      
