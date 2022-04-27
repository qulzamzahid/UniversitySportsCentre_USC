/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.managment.sport_center;
import java.util.ArrayList;

/**
 *
 * @author ?
 */
public class Week  {
    
    private int week_no;
    private Lesson lesson[];
    private String [] day_names;

    public int getWeek_no() {
        return week_no;
    }

    public void setWeek_no(int week_no) {
        this.week_no = week_no;
    }

    public Lesson[] getLesson() {
        return lesson;
    }

    public void setLesson(Lesson[] lesson) {
        this.lesson = lesson;
    }

    public String[] getDay_names() {
        return day_names;
    }

    public void setDay_names(String[] day_names) {
        this.day_names = day_names;
    }
}
