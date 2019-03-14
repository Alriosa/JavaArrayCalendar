/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraycalendar;

/**
 *
 * @author Alriosa
 */
import java.io.*;

public class JavaArrayCalendar {

    /**
     * @param args the command line arguments
     */
    static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream print = System.out;

    public static void main(String[] args) throws IOException {
        
        int[] days = new int[7];
        int[] temperature = new int[7];
       
        
        System.out.println("Welcome to climate system");
        System.out.println("Enter the week temperature day by day");
        
         for(int i=0 ; i < days.length; i++){ // For de ingreso de datos
        
            System.out.println("Enter day " + i + " Temperature") ;
            temperature[i] = Integer.parseInt(read.readLine());
            
        }
       
        for(int a=0 ; a < days.length; a++){ //For de impresion
        
            System.out.println("The temperature of the day "+ a +" is " + temperature[a]) ;
            
         
        }
        
        
    }

}
