

import java.io.*;
import java.io.FileOutputStream;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class file {
    
    file()
    {
        try{
        PrintStream myconsole = new PrintStream(new File("C:\\Users\\user\\Desktop\\Monir\\out.txt"));
        
        System.setOut(myconsole);
        
       
    
    myconsole.print("University: "+Scene.University +" \n"+"HSC Board:  "+Scene.BoardHsc+" \n"+"HSC Roll:  "+Scene.RollHsc+" \n"+"HSC Passing Year: "+Scene.PassingHsc+" \n"+"SSC Board: "+Scene.BoardSsc+" \n"+"SSC Roll: "+Scene.RollSsc+" \n"+"SSC Passing Year: "+Scene.PassingSsc+" \n"+"Unit: "+Scene.Unit );
    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    public static void main(String args[])  {
    
    
    }
    
}
