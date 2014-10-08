/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Erik
 */
public class Sorting {
    
    public static void InsSortGrade(Student[] SList){
        for(int i=1;i<SList.length;i++){
            Student temp = SList[i];
            int j;
            for(j=i-1;j>=0&&temp.getGrade()<SList[j].getGrade(); j--){
                SList[j+1]=SList[j];
            }
            SList[j+1]= temp;
        }
    }
    
    public static Student[] InsSortID(Student[] SList){
        for(int i=1;i<SList.length;i++){
            Student temp = SList[i];
            int j;
            for(j=i-1;j>=0&&temp.getStudentNumber()<SList[j].getStudentNumber(); j--){
                SList[j+1]=SList[j];
            }
            SList[j+1]= temp;
        }
        return SList;
    }
    
    public static void SortGroup(Student[] SList){
        ArrayList Groups = new ArrayList();
        for (int i = 0; i < SList.length+1; i++) {
            if (!CheckArray(Groups, SList[i].getGroup())) {
                Groups.add(SList[i].getGroup());
            }
        }
        for (int i = 0; i < Groups.size()+1; i++) {
            Student[] Sa = new Student[32];
            for (int j = 0; j < SList.length; j++) {
                if (SList[j].getGroup() == Groups.get(i)) {
                    Sa[i] = SList[j];
                }
            }
            System.out.println(Arrays.toString(InsSortID(Sa)));
           
        }
    }
    
    
    public static boolean CheckArray(ArrayList a, String s){
        for (int i = 0; i < a.size()+1; i++) {
            if (s == a.get(i))
                return true;
            }
        return false;
        }
    }




