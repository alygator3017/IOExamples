package inclasswork;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ajSchmidt-Zimmel
 */
public class FileServiceTest {
    public static void main(String[] args) throws IOException {
        File file = new File("src" + File.separatorChar + "GarageTotals.txt");
        
        
        
        
        TextFormatStrategy format = new GarageTotalsFormatter();
        FileService fs = new FileService(new TextReader(format), new TextWriter(format));
        List<Map> fileContent = fs.readFile(file);
        System.out.println(fileContent);
        Map<String,String> map = new HashMap<>();
        map.put("Date", LocalDate.now().toString());
        map.put("TotalHours", "193");
        map.put("TotalFees","1987");
        List<Map> data = new ArrayList();
        data.add(map);
        System.out.println(data.get(0));
        fs.writeToFile(data, file, false);
    }
    
}
