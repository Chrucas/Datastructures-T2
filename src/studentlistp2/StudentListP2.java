/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlistp2;

import Models.Initialize;
import Models.Student;
import Models.Sorting;


/**
 *
 * @author gebak_000
 */
import java.util.*;
public class StudentListP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[]SList = new Student[200];
        Initialize.setStudents(SList);
        
       // Sorting.InsSortGrade(SList);
        Sorting.SortGroup(SList);
       // Initialize.print(SList);
        
    }
}
