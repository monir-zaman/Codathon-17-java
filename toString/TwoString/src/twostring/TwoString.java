/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package twostring;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author user
 */
public class TwoString
{
   public static void main(String args[])
   {
      String str1, str2, str3, upper, lower;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter First String");
      str1 = in.nextLine();
 
      System.out.println("Enter Second String");
      str2 = in.nextLine();
 
      System.out.println("string length is: "+str1.length());
      System.out.println("string length is: "+str2.length());
      
      str3 = str1.concat(str2);
      
      System.out.println("Concated String : "+str3);
      
      int result = str1.compareTo( str2 );
      //System.out.println(result);
      
      if(result == 0) System.out.println("the strings are same");
      
      else  System.out.println("the strings are not same");
      
      //else if(result < 0) System.out.println("the strings are same");
      
      upper = str1.toUpperCase();
      lower = str2.toLowerCase();
  
      System.out.println(upper);
      System.out.println(lower);
      

      
      
   }
}