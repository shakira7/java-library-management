/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management;

import java.util.ArrayList;

public class Students {
    
    private ArrayList<Student> studentList;
    
    public Students(){
        studentList = new ArrayList<>();
    }
    
    public void addStudent(String name){
        Student stu = new Student(name);
        studentList.add(stu);
    }
    
    public Student getStudent(int index){
        if (index >= 0 && index < studentList.size()) {
            return studentList.get(index);
        }
        else {
            System.out.println("Student not found");
            
        }
        return null;
        
    }
    
    
    
    
    
}
