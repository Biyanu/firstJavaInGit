/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;


/**
 *
 * @author Biyanu
 */
public class Student {
    
    public static void main(String[] args) {
   int Maths, Chemistry, English, History, Biology;
    int Total;
    double Average;
    Scanner values = new Scanner(System.in);
        System.out.println("Enter the grades scored by the student in Each Subject:");
        System.out.print("Enter marks in Maths:");
        Maths = values.nextInt();
        System.out.print("Enter marks in Chemistry:");
        Chemistry = values.nextInt();
        System.out.print("Enter marks in English:");
       English = values.nextInt();
        System.out.print("Enter marks in History:");
       History = values.nextInt();
        System.out.print("Enter marks in Biology:");
       Biology= values.nextInt();
       Total = Maths+ Chemistry+ English+History+Biology;
       Average = Total/5;
       if(Average>=90){
       System.out.println("The student is in a 'very good' standing");
       }
       else if(Average>=70){
       System.out.println("The student is in a 'good' standing");
      
    }
       else if(Average>=50){
       System.out.println("The student is in a 'Fair' standing");
      
    }
    else if(Average<=50){
       System.out.println("The student has failed");
      
    }
       else {
       System.out.println("The student is 'incomplete'");
      
    }
       System.out.println("The students Average is:" + " " + Average);
      System.out.print("And his/her total score is:" + " " + Total);
    }
}
