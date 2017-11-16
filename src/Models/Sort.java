/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.ArrayList;
import java.util.HashMap;
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
    


    public static void quicksortingGrade(Student[] Slist) {
            // check for empty or null array
            if (Slist ==null || Slist.length==0){
                    return;
            }
            
            int students = Slist.length;
            quicksortGrade(0, students - 1, Slist);
    }

    private static void quicksortGrade(int low, int high, Student[] Slist) {
            int i = low, j = high+1;
            // Get the pivot element from the middle of the list
            int pivot = (int) Slist[low + (high-low)/2].getGrade();

            // Divide into two lists
            while (i <= j) {
                    // If the current value from the left list is smaller then the pivot
                    // element then get the next element from the left list
                    while (Slist[i].getGrade() <= pivot) {
                            i++;
                    }
                    // If the current value from the right list is larger then the pivot
                    // element then get the next element from the right list
                    while (Slist[j].getGrade() > pivot) {
                            j--;
                    }

                    // If we have found a values in the left list which is larger then
                    // the pivot element and if we have found a value in the right list
                    // which is smaller then the pivot element then we exchange the
                    // values.
                    // As we are done we can increase i and j
                    if (i <= j) {
                            exchangeGrade(i, j, Slist);
                            i++;
                            j--;
                    }
            }
            // Recursion    
            if (low < j)
                    quicksortGrade(low, j-1, Slist);
            if (i < high)
                    quicksortGrade(i+1, high, Slist);
    }

    private static void exchangeGrade(int i, int j, Student[] Slist) {
            int temp = (int) Slist[i].getGrade();
            Slist[i].setGrade(Slist[j].getGrade());
            Slist[j].setGrade(temp);
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
        Map<String, ArrayList> Bckts = new HashMap<>();
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




