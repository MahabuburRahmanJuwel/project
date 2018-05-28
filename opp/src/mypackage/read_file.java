
package mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class read_file {

    private boolean EXIT;
    
    
   
    public void read() throws IOException{
        
        Scanner input =new Scanner (System.in);
        BufferedReader br= null;
        String line;
        int num=0;
        
        try{
            System.out.println("please enter the file name to be read ");
 br=new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\information\\" +input.next()));
        }catch(Exception e){
            
            System.out.println("file not found");
            System.exit(0);
        }
        
          try{
            while ((line=br.readLine())!=null){
                
                
           System.out.println(line);}
            }
            catch(IOException ioex){
                   System.out.println(ioex.getMessage() +"erro reading file");
                   System.exit(0); 
       }
   
           
          
}   
    }  
    

