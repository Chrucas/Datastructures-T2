/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.text.DecimalFormat;
import java.util.Random;
/**
 *
 * @author Erik
 */
public class Create {
    private int size;
    DecimalFormat df = new DecimalFormat("#.#");
    public Create(int size){
    Student[]SList = new Student[size];
    for(int i = 0;i<i+size;i++){
       SList[i]= new Student();  
    }    
    this.size=size;    
    }
    public void initialize(Student[] SList){
       Random ran = new Random();
       for(int i=1;i<i+SList.length;i++){
           double grade = (ran.nextInt(9)+1)+ran.nextDouble()*10+1;
           if (grade>10.0){
                grade= 10.0;
           }
           SList[i].setGrade(grade);

           for(int j=50060001;j<j+size;j++)
           SList[i].setStudentNumber(j);
           
           SList[i].setGroup(null);
       }
    }
    
    public void InsSortGrade(Student[] SList){
        for(int i=1;i<SList.length;i++){
            Student temp = SList[i];
            int j;
            for(j=i-1;j>=0&&temp.getGrade()<SList[j].getGrade(); j--){
                SList[j+1]=SList[j];
            }
            SList[j+1]= temp;
        }
    }
}    