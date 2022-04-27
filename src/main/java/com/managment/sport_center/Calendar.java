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
public class Calendar {

    public  ArrayList<Week> weeks = new ArrayList<>();
    public Calendar()
    {
        Week week1=new Week();
        week1.setWeek_no(1);
        String days_pack_1[];
        days_pack_1=new String[]{"SATURDAY","SUNDAY"};
        week1.setDay_names(days_pack_1);
        Lesson l=new Lesson();
        Lesson l0=new Lesson();
        String Lesson_pack_1[];
          String Lesson_pack_10[];
        Lesson_pack_1=new String []{"YOGA","ZUMBA","AQUACISE"};
         Lesson_pack_10=new String []{"YOGA","ZUMBA","AQUACISE"};
        l.setLesson_names(Lesson_pack_1);
        l0.setLesson_names(Lesson_pack_10);
        Lesson list2[];
        list2=new Lesson[]{l,l0};
        week1.setLesson(list2);
        
            Week week2=new Week();
        week2.setWeek_no(2);
        String days_pack_w2[];
        days_pack_w2=new String[]{"SATURDAY","SUNDAY"};
        week2.setDay_names(days_pack_w2);
        Lesson w21=new Lesson();
        Lesson w22=new Lesson();
        String Lesson_pack_w21[];
          String Lesson_pack_w22[];
        Lesson_pack_w21=new String []{"YOGA","ZUMBA","AQUACISE"};
        Lesson_pack_w22=new String []{"YOGA","ZUMBA","AQUACISE"};
        w21.setLesson_names(Lesson_pack_w21);
        w22.setLesson_names(Lesson_pack_w22);
        Lesson listw2[];
        listw2=new Lesson[]{w21,w22};
        week2.setLesson(listw2);
        weeks.add(week1);
        weeks.add(week2);
   
    }
    
    public boolean addbooking(Booking booking)
    {
        boolean r=true;
         for(int i=0;i<this.weeks.size();i++)
        {
          //  System.out.println("\n\nWEEK NO - "+weeks.get(i).getWeek_no());
            for(int j=0;j<weeks.get(i).getDay_names().length;j++)
            {
              if(weeks.get(i).getDay_names()[j].equals(booking.getDay()))
                {        
                 //   System.out.println("DAY NAME - "+weeks.get(i).getDay_names()[j]);
                    for(int y=0;y<3;y++)
                    {
                         if(weeks.get(i).getLesson()[j].getLesson_names()[y].equals(booking.getLesson()))
                         {
                              int count= weeks.get(i).getLesson()[j].getLesson_count()[y]; 
                              
                                if(count<3)
                                {
                                      weeks.get(i).getLesson()[j].getLesson_count()[y]=count+1; 
                                }
                                else
                                {
                                    r=false;
                                 System.out.println("The limit has been reached!");
                                }
                           
                    }
                }
            }
         
        
       
    }
    }
          return r;
    }
    
    
    public boolean remove_booking(Booking booking)
    {
        boolean r=true;
         for(int i=0;i<this.weeks.size();i++)
        {
          //  System.out.println("\n\nWEEK NO - "+weeks.get(i).getWeek_no());
            for(int j=0;j<weeks.get(i).getDay_names().length;j++)
            {
              if(weeks.get(i).getDay_names()[j].equals(booking.getDay()))
                {        
                 //   System.out.println("DAY NAME - "+weeks.get(i).getDay_names()[j]);
                    for(int y=0;y<3;y++)
                    {
                         if(weeks.get(i).getLesson()[j].getLesson_names()[y].equals(booking.getLesson()))
                         {
                              int count= weeks.get(i).getLesson()[j].getLesson_count()[y]; 
                              
                                if(count<3)
                                {
                                      weeks.get(i).getLesson()[j].getLesson_count()[y]=count-1; 
                                }
                                else
                                {
                                    r=false;
                                 System.out.println("The limit has been reached!");
                                }
                         }
                }
            }
         
        
       
    }
    }
          return r;
    }
    
    public void display_clendar_day_name(String name)
    {
            
        for(int i=0;i<this.weeks.size();i++)
        {
            System.out.println("\n\nWEEK NO - "+weeks.get(i).getWeek_no());
            for(int j=0;j<weeks.get(i).getDay_names().length;j++)
            {
              if(weeks.get(i).getDay_names()[j].equals(name))
                {        
                    System.out.println("DAY NAME - "+weeks.get(i).getDay_names()[j]);
                    for(int y=0;y<3;y++)
                    {
                     System.out.println("LESSON - "+y+" "+weeks.get(i).getLesson()[j].getLesson_names()[y]);   
                    }
                }
            }
        }
    }
    
     public void display_clendar_lesson_name(String name)
    {
            
        for(int i=0;i<this.weeks.size();i++)
        {
            System.out.println("\n\nWEEK NO - "+weeks.get(i).getWeek_no());
            for(int j=0;j<weeks.get(i).getLesson().length;j++)
            {
                       System.out.println("DAY NAME "+weeks.get(i).getDay_names()[j]);
                    for(int y=0;y<3;y++)
                    {
                        if(weeks.get(i).getLesson()[j].getLesson_names()[y].equals(name))
                         System.out.println("LESSON - "+y+" "+weeks.get(i).getLesson()[j].getLesson_names()[y]);   
                    }
                }
            }
        }
    }
