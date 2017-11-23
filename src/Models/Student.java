/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author gebak_000
 */
public class Student implements Comparable<Student> {
    
    private int studentNumber;
    private double grade;
    private String group;

    public Student() {
    }

    
    public Student(int studentNumber, double grade, String group) {
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.group = group;
    }
/**
 * 
 * Getters and setters for the student class. 
 */
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNumber=" + studentNumber + ", grade=" + grade + ", group=" + group + '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.grade < student.getGrade()) {
            return -1;
        } else if (this.grade == student.getGrade()) {
            if (this.studentNumber > student.getStudentNumber()) {
                return 1;
            }
            return 0;
        } else {
            return 1;
        }
    }
    
    public int compareToStudentNr(Student student) {
        if (this.studentNumber < student.getStudentNumber()) {
            return -1;
        } else {
            return 1;
        }
    }
    
    
}
