/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.managment.sport_center;

/**
 *
 * @author ?
 */
public class Lesson 
{
     private String []  lesson_names;
     private int student_count;
     int lesson_count[];
     public Lesson()
    {
      lesson_names=new String []{"YOGA","ZUMBA","AQUACISE"};
      lesson_count=new int[]{0,0,0};
    }

    public int getStudent_count() {
        return student_count;
    }

    public void setStudent_count(int student_count) {
        this.student_count = student_count;
    }

    public int[] getLesson_count() {
        return lesson_count;
    }

    public void setLesson_count(int[] lesson_count) {
        this.lesson_count = lesson_count;
    }

    public String[] getLesson_names() 
    {
        return lesson_names;
    }

    public void setLesson_names(String[] lesson_names) 
    {
        this.lesson_names = lesson_names;
    }
}