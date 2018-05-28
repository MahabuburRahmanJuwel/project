
package mypackage;

import java.io.IOException;

/**
 *
 * @author DELL
 */
public class mainclass {
    
    public static void main(String[] args) throws IOException {
        open_folder box=new open_folder();
        box.open();
        
       define_s box1 =new define_s();
       box1.num_of_s();
        
       define_t box2 =new define_t();
       // box2.define_t();
        
        read_file box3 = new read_file();
       box3.read();
    }
    
    
    
}
