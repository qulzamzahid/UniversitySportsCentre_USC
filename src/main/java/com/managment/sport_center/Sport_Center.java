/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.managment.sport_center;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ?
 */
public class Sport_Center {

    public final static ArrayList<Booking> bookings = new ArrayList<>();
    private final static Student student=new Student();
    public final static ArrayList<Student> student_list = new ArrayList<>();
    public final static  Calendar c=new Calendar();
    public static int log_id;
    public static void main(String[] args)
    {
        login();
    }

    public static void login()
    {
        Scanner src= new Scanner(System.in);
        int password=0;
        int roll=0;
        
        int c=0;
        userLog();
        System.out.print("Enter Student ID: ");
        roll=src.nextInt();
        System.out.print("Enter Password: ");
        password=src.nextInt();
        for(int i=0;i<student_list.size(); i++)
        {
           if(student_list.get(i).rollNo==roll&&password==student_list.get(i).password)
           {
               System.out.println("\n\nLogin Successful");
               log_id=roll;
               c++;
           }   
        }
        if(c==0)
        {
            System.out.println("Student ID or Password Not Valid!!!");
        }
        else
        {
            Start();
        }
    }
    public static void  userLog()
    {
      Student s1=new Student();
       Student s2=new Student();
       Student s3=new Student();
       Student s4=new Student();
       Student s5=new Student();
       Student s6=new Student();
       Student s7=new Student();
       Student s8=new Student();
       s1.name="Qulzam";
       s1.rollNo=21026763;
       s1.password=292;
       s2.name="Zahid";
       s2.rollNo=111;
       s2.password=222;
       s3.name="Waqar";
       s3.rollNo=333;
       s3.password=444;
       s4.name="Rabi";
       s4.rollNo=555;
       s4.password=666;
       student_list.add(s1);  
       student_list.add(s2);
       student_list.add(s3);
       student_list.add(s4);
    }
      public static void Start()
     
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        int choice=0; 
       
        System.out.println("\n\n\n 1  BOOK A GROUP EXERCISE ");
        System.out.println(" 2  CHANGE A BOOKING ");
        System.out.println(" 3  ATTEND A LESSON ");
        System.out.println(" 4  MONTHLY LESSON REPORT ");
        System.out.println(" 5  MONTHLY CHAMPION EXERCISE REPORT ");
        System.out.println(" 6  Exit ");
        System.out.println(" 7  Change the User ");
        System.out.println("\n Enter your choice: ");

        choice=sc.nextInt();
  
        switch(choice)
        {    
        case 1 ->     
        {
          start_calendar();
           booking();
        }
        case 2 -> 
        {
            System.out.print("\nYOUR BOOKINGS\n\n\n");
            displayBooking();
            change_bookings();
        }
        case 3 -> 
        {
              //code to be executed;
        }
        case 4 ->
        {
            //code to be executed;
        }
        case 5 ->
        {
          
        }
        case 6 ->
        {
            //code to be executed;

        }
         case 7 -> 
        {
            //code to be executed;
            login();
        }
        default ->
        {      
              System.out.println("############>> INVALID OPERATION NUMBER YOU ENTERED READY ACTION MENU CAREFULLY <<###############");
              Start();
        }
        }
    }
    
    
    public static void start_calendar()
    {
         int option=0;
         Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
         
         System.out.println(" 1 TO CHECK TIME TABLE  FOR A  GROUP EXERCISE BY DAY NAME |");
         System.out.println(" 2 TO CHECK TIME TABLE  FOR A  GROUP EXERCISE BY LESSON NAME |");
     
   option=sc.nextInt();

         switch(option)
         {    
         case 1 ->     
         {  
             int choice2=0;
             System.out.println("\n\n1 FOR SATURDAY");
             System.out.println("2 FOR SUNDAY");
             choice2=sc.nextInt();
             switch(choice2)
         {    
         case 1 ->     
         {
             c.display_clendar_day_name("SATURDAY");
         }
         case 2 ->
         {
              c.display_clendar_day_name("SUNDAY");
         }
         default ->
         {

         }
        
         }  
                    
        }

        case 2 -> 
        {
          Scanner scr= new Scanner(System.in); //System.in is a standard input strea
          String lesson;
          System.out.print("ENTER THE LESSON NAME ");
          lesson =scr.next();
          c.display_clendar_lesson_name(lesson);
        }
        case 3 -> 
        {
              
        }
        default ->
        {          
                      
        }
                      
        }
    }

    public static void displayBooking()
    {
        for(int y=0;y<bookings.size();y++)
        {
            if(bookings.get(y).getStudentid()==log_id)
            {
                System.out.println("BOOKING ID "+bookings.get(y).getBookingid());
                System.out.println("WEEK NUMBER "+bookings.get(y).getWeekNo());
                System.out.println("DAY NAME "+bookings.get(y).getDay());
                System.out.println("LESSON NAME  "+bookings.get(y).getLesson());
            }
            System.out.print("\n");
        }
    }
    
    public static void booking()
    {
         Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
         Booking book=new Booking();
         String dayname;
         String lesson;
         int option=0;
         
           System.out.println("\n\nENTER WEEK NO ");
           int  weekNo=sc.nextInt();
           System.out.println("ENTER DAY NAME ");
             dayname =sc.next();
           System.out.println("ENTER LESSON NAME ");
             lesson =sc.next();
           book.setDay(dayname);
           book.setLesson(lesson);
           book.setWeekNo(weekNo);
           book.setStudentid(log_id);
           Random rand=new Random();
               int r=rand.nextInt();
                r=r+weekNo;
                book.setBookingid(r);
           if(c.addbooking(book))
           {
           if(add_booking(book))
           {
               System.out.print("\n\n\nBOOKING ADD NEW\n");
               Start();
           }
           else
           {
              System.out.print("BOOKING FAILD BECASUE STUDENT HAVE SAME BOOKING ALREADY \n\n");
              Start();
           }
           }
           else
           {
                System.out.print("THIS LESSON HAS NO MORE SEATS IN THIS WEEK AND DAY \n\n");
                Start();
           }
           display_booking();
    }

    public static void update_booking(int bookingid)
    {
         Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
         Booking book=new Booking();
          String dayname;
           String lesson;
         int option=0;
       
         System.out.println("ENTER LESSON NAME ");
          Scanner sc2= new Scanner(System.in); //System.in is a standard input stream.
         lesson =sc2.next();
         System.out.println("ENTER DAY NAME ");
         dayname =sc.next();
           System.out.println("ENTER WEEK NO ");
         int  weekNo=sc.nextInt();
       
         book.setDay(dayname);
         book.setLesson(lesson);
         book.setWeekNo(weekNo);
         book.setStudentid(log_id);
         book.setBookingid(bookingid);
        
         if(c.addbooking(book))
           {
           if(add_UPDATE(book))
           {
               System.out.print("BOOKING  UPDATE\n");
                Start();
           }
           else
           {
              System.out.print("BOOKING FAILD BECASUE STUDENT HAVE SAME BOOKING ALREADY \n\n");
              Start();
           }
           }
           else
           {
                System.out.print("THIS LESSON HAS NO MORE SEATS IN THIS WEEK AND DAY \n\n");
                Start();
           }
           display_booking();
        
    }
    
     public static void display_booking()
     {
     for(int y=0;y<bookings.size();y++)
        {
            System.out.print(bookings.get(y).getLesson());
        }
    }
    
     public static void change_bookings()
     {
          Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
         int id;
          System.out.println("1 FOR CANCELL ANY BOOKING");
          System.out.println("2 FOR CHANGE ANY BOOKING");
          id=sc.nextInt();
          if(id==1)
          {
              int d;
              System.out.print("ENTER BOOKING ID YOU WANT TO CANCEL");
              d=sc.nextInt();
              remove_book(d);
              Start();
              
          }
          if(id==2)
          {
              canncel_booking();
          }
     }
     public static void canncel_booking()
     {
          Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
         int id;
          System.out.println("ENTER BOOKING ID");
          id=sc.nextInt();
          start_calendar();
          update_booking(id);
     }
     
     public static void remove_book(int id)
     {
         for(int y=0;y<bookings.size();y++)
        {
             if(bookings.get(y).getBookingid()==id)
             {   Booking b=new Booking();
                 b=bookings.get(y);
                 c.remove_booking(b);
                 bookings.remove(y);
             }
        }
     }

     public static boolean add_booking(Booking booking)
    {
        //check the user also
       boolean result=true;
       if(bookings.size()>0)
       {
         for(int y=0;y<bookings.size();y++)
        {
          if(bookings.get(y).getStudentid()==booking.getStudentid())
          {
            if(bookings.get(y).getWeekNo()==booking.getWeekNo())
            {
                if(bookings.get(y).getDay().equals(booking.getDay()))
                {
                    if(bookings.get(y).getLesson().equals(booking.getLesson()))
                    {
                        result=false;
                    }
                   
                }
            } 
        }
        }
       }
       else
       {
           result=true;
       }
        if(result)
        {
            bookings.add(booking);
        }
        return result;
    }
    public static boolean add_UPDATE(Booking booking)
    {
        //check the user also
        for(int i=0;i<bookings.size();i++)
        {
            
            if(bookings.get(i).getBookingid()==booking.getBookingid())
            {
                bookings.add(i, booking);
            }
        }
       return true;
    }
}
