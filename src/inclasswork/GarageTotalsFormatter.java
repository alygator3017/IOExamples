package inclasswork;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ajSchmidt-Zimmel
 */
public class GarageTotalsFormatter implements TextFormatStrategy{

    @Override
    public List<Map> decode(String data) {
        String[] tokens = data.split(",");
        
        Map<String, String> record = new LinkedHashMap<>();
        for(int i = 0; i < tokens.length - 1;i++){
            record.put(tokens[i], tokens[i+1]);
            i++;
        }
        
        List<Map> records = new ArrayList<>();
        records.add(record);
        
        return records;
    }

    @Override
    public void encode(List<Map> data, PrintWriter out) {        
//        data.get(0).get("365");
        for(Map<String,String> map : data){
            Set keys = map.keySet();
            List<String> listKeys = new ArrayList<>(keys);
            for(String key : listKeys){
                String k = key;
                String value = map.get(key);
                out.append(k + "," + value +",");
                out.write("\r\n");
            }
        }
        
        
    }
    
//    public static void main(String[] args) {
//        GarageTotalsFormatter g = new GarageTotalsFormatter();
//        Map<String,String> map = new HashMap<>();
//        map.put("365","1987");
//        List<Map<String,String>> data = new ArrayList();
//        data.add(map);
//        System.out.println(data.get(0));
//        PrintWriter out = null;
//        try {
//            out = new PrintWriter(
//                    new BufferedWriter(
//                            new FileWriter(new File("src/garageFormatTest.txt"))));
//            g.encode(data, out);
//            System.out.println();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }finally{
//            out.close();
//        }
//    }
    
}
