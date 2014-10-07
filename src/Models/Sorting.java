/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class Sorting {
    
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
    
    public void SortGroup(Student[] SList){
        ArrayList Groups = new ArrayList();
        for (int i = 0; i < SList.length+1; i++) {
            if (!CheckArray(Groups, SList[i].getGroup())) {
                Groups.add(SList[i].getGroup());
            }
        }
    }
    
    public boolean CheckArray(ArrayList a, String s){
        for (int i = 0; i < a.size()+1; i++) {
            if (s == a.get(i))
                return true;
            }
        return false;
        }
    }




