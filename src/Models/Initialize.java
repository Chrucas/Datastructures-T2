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

    
        
    static Double mkGrd() {

        Random ran = new Random();    
        double grade = (ran.nextDouble()*9.1)+1.0;
        grade = (Math.floor(grade * 10)/10);
        return grade;
        
    }
    
/***
 * 
 * @param S
 * 
 * de setStudents methode wordt gebruikt om de lege Student list te vullen met data zoals de grade, student nummer en klas.
 * 
 */    

    public static void setStudents(Student[]S){
        double GroupNr = (((S.length/4.0)/32.0));//aantal klassen per richting
        
        int groupNmr = (int) Math.ceil(GroupNr*4.0);//aantal klassen totaal
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
    
    /*
    deze print methode wordt gebruikt om alles uit te printen.
    */
    public static void print(Student[]S){
        for(int i=0;i<S.length;i++){
            System.out.println(i+1 + " - " + S[i]);            
        }
    }
}    
      
