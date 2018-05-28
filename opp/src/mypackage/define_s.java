
package mypackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


 class define_s  extends open_folder {
    
     
   void num_of_s() throws IOException{
        
        //System.err.println(path);
         File file= new File( "C:/Users/DELL/Desktop/information/student.txt");
       file.createNewFile();
         int i,num;
        Scanner input=new Scanner (System.in);
        System.out.print("how many student : ");
        num=input.nextInt();
       
        FileWriter filewriter=new FileWriter (file,true);
    BufferedWriter  Buffer= new  BufferedWriter (filewriter);
        PrintWriter printwriter =new  PrintWriter(Buffer);
        
      
for(i=1;i<=num;i++){
    String name,id;
    float cgpa;
    System.out.println("Name:");
    name=input.next();
    System.out.println("ID:");
    id=input.next();
    System.out.println("cgpa:");
    cgpa=input.nextFloat();
    printwriter.println(name +" "+id +" "+cgpa);
  
}
        printwriter.close(); 
        
    }
 
    
}
