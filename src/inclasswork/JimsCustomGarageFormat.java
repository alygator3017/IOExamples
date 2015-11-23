package inclasswork;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alyson
 */
public class JimsCustomGarageFormat implements TextFormatStrategy {

    //job of this is to encode and decode
    
    //decode
    @Override
    public List<Map> decode(String data){
        String[] tokens = data.split(" ");
        
        Map<String, String> record = new LinkedHashMap<>();
        
        record.put("totalHours", tokens[0]);
        record.put("totalFees", tokens[1]);
        
        List<Map> records = new ArrayList<>();
        records.add(record);
        
        return records;
    }
    //debug
//    public static void main(String[] args) {
//        JimsCustomGarageFormat fmt = new JimsCustomGarageFormat();
//        
//        List<Map<String, String>> data = fmt.decode("22.50 42.60");
//        
//        System.out.println("Total Hours: " + data.get(0).get("totalHours"));
//        System.out.println("Total Fees: " + data.get(0).get("totalFees"));
//    }

    @Override
    public void encode(List<Map> data, PrintWriter out) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
