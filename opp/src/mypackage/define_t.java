
package mypackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class define_t  {
    void define_t () throws IOException{
       
        
      File file1= new File("C:/Users/DELL/Desktop/information/teacher.txt");
        file1.createNewFile();
        
        
       FileWriter filewriter_t=new FileWriter (file1,true);
        BufferedWriter  Buffer_t= new  BufferedWriter (filewriter_t);
        PrintWriter printwriter_t =new  PrintWriter(Buffer_t);
         int i,num;
        String name,id;
    
        Scanner input=new Scanner(System.in);
        System.out.print("how many teacher : ");
        num=input.nextInt();
        
        for(i=1;i<=num;i++){
    
    float cgpa;
    System.out.println("teacher Name:");
    name=input.next();
    System.out.println("teacher ID:");
    id=input.next();
 printwriter_t.println(name +" "+id );
  
} 
        printwriter_t.close();
    
   }
}
