/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.text.DecimalFormat;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author Erik
 */
public class Create {
    
    private int size;
    DecimalFormat df = new DecimalFormat("#.#");
    private String[] Groups;
    
    // creates an array of students with empty fields
    public Create(int size){
    Student[]SList = new Student[size];
    for(int i = 0;i<i+size;i++){
    SList[i]= new Student();   
    
       SList[i]= new Student();  
    }    
    this.size=size;  
    }
    
    // fills the fields of the student array
    public void initialize(Student[] SList){
       Random ran = new Random();
       int GroupNr = (int) Math.ceil((((size/4)/32)*4));
       String[] fieldsOfStudy = new String[]{"G", "N", "S", "T"};
       Groups = new String[size];
        for (int i=0,j=0,y=01; i<GroupNr+1; i++) {
            Groups[i] = "I" + fieldsOfStudy[j] + 2 + "";
        }
       // loop through student array
       for(int i=1;i<i+SList.length;i++){
           // assigns the studentnumber
           double grade = (ran.nextInt(9)+1)+ran.nextDouble()*10+1;
           if (grade>10.0){
                grade= 10.0;
           }
           SList[i].setGrade(grade);

           for(int j=50060001;j<j+size;j++)
           SList[i].setStudentNumber(j);
           grade = (ran.nextInt(9)+1)+ran.nextDouble()*10+1;
           SList[i].setGrade(grade);
           if (grade>10.0){
            grade= 10.0;
            }
           // assigns the students to a class
            SList[i].setGroup("I" + "" + 2 + "");
       }
    }
    
    
}    
