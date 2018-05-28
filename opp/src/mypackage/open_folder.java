
package mypackage;

import java.io.File;

public class open_folder {
    
      void  open(){
     
    File folder=new File("C:/Users/DELL/Desktop/information");
    folder.mkdir();

        
        System.out.println(folder.getAbsolutePath());
        System.out.println(folder.getName());
        
      //  return path;
      
    }
     
    
    
    
}
