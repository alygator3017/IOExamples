package inclasswork;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * File Service structure for handling file data.
 * This is the base class for the File Service class structure.
 * 
 * @author ajSchmidt-Zimmel
 */
public class FileService {
    //build code bottom up
    private final TextReader reader;
    private final TextWriter writer;

    public FileService(TextReader reader, TextWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    
    //delegates it to the component to do that actual work
    public List<Map> readFile(File file) throws IOException{
        return reader.readFile(file);
    }
    
    public void writeToFile(List<Map> data, File file, boolean append) throws IOException{
        writer.writeToFile(data, file, append);
    }
    
//    public static void main(String[] args) throws IOException {
//        TextFormatStrategy format = new GarageFormatter();
//        FileService fs = new FileService(new TextReader(format), new TextWriter(format));
//        Map<String,String> map = new HashMap<>();
//        map.put("Date")
//        map.put("TotalHours", "193");
//        map.put("TotalFees","1987");
//        List<Map<String,String>> data = new ArrayList();
//        data.add(map);
//        System.out.println(data.get(0));
//        fs.writeToFile(data, new File("src/garageFormatTest.txt"), false);
//    }
}
