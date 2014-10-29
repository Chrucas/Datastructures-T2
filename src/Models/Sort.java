/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Erik
 */
public class Sort {
    
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
    
    static void insert(ArrayList g, Student s) {
        int i=0; 
        while (i<g.size() && ((Student) g.get(i)).getGrade()<s.getGrade() ) i++;
        g.add(i,s);
    }
    
    public static Student[] SortGroup(Student[] SList){
        Map<String, ArrayList> Bckts = new HashMap<String, ArrayList>();
        ArrayList keys = new ArrayList();
        for (int i = 0; i < SList.length; i++) {
            String key = SList[i].getGroup();
            keys.add(key);
            ArrayList grp;
            if (!Bckts.containsKey(key)) Bckts.put(key,new ArrayList());
            grp = Bckts.get(key);
            insert(grp,SList[i]);
        }
        Student[] newSList = new Student[SList.length];
        int k=0;
        for (int i=0; i<Bckts.size(); i++) {
            for (int j=0; j<Bckts.get(keys.get(i)).size(); j++) {
                newSList[k++] = (Student)((ArrayList)(Bckts.get(keys.get(i)))).get(j);
            }
        }
        return newSList;
          
        
    }
       
    public static boolean CheckArray(ArrayList a, String s){
        for (int i = 0; i < a.size()+1; i++) {
            if (s == a.get(i))
                return true;
            }
        return false;
        }
    }




