package inclasswork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ajSchmidt-Zimmel
 */
public class TextReader {
    
    private TextFormatStrategy formatter;

    public TextReader(TextFormatStrategy formatter) {
        this.formatter = formatter;
    }
    
    
    
    public List<Map> readFile(File file) throws IOException{
              
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder();
        try {
	   in = new BufferedReader(new FileReader(file));
	   String line = in.readLine();
	   while(line != null){
		  sb.append(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            //no messaging- just delegate it to the caller
            throw ioe;
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                throw e;
            }
        }
        
        return formatter.decode(sb.toString());
    }
    
   
}
 