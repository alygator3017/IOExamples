package inclasswork;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Alyson
 */
public class GarageTotalsPlusCarsFormatter implements TextFormatStrategy{

    @Override
    public List<Map> decode(String data) {
        String[] tokens = data.split(" ");
        Map<String, String> record = new LinkedHashMap<>();
        for(int i = 0; i < tokens.length - 1;i++){
            record.put(tokens[i + 3], tokens[i] + " " + tokens[i + 1] +  " " + tokens[i + 2]);
            i+=3;
        }
        
        List<Map> records = new ArrayList<>();
        records.add(record);
        
        return records;
    }

    @Override
    public void encode(List<Map> data, PrintWriter out) {
        for(Map<String,String> map : data){
            Set keys = map.keySet();
            List<String> listKeys = new ArrayList<>(keys);
            for(String key : listKeys){
                String k = key;
                String value = map.get(key);
//                System.out.println(value + " " + k);
                out.append(value + " " + k);
                out.write("\r\n");
            }
        }
        
    }

//    public static void main(String[] args) throws IOException {
//        TextReader reader = new TextReader(new GarageTotalsPlusCarsFormatter());
//        List<Map> fileContent = reader.readFile(new File("src/DailyTotals.txt"));
////        System.out.println(fileContent);
//        TextWriter writer = new TextWriter(new GarageTotalsPlusCarsFormatter());
//        writer.writeToFile(fileContent, new File("src/DailyTotals.txt"), true);
//    }
    
}
