package inclasswork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ajSchmidt-Zimmel
 */
public class TextWriter {

    private final TextFormatStrategy formatter;

    public TextWriter(TextFormatStrategy formatter) {
        this.formatter = formatter;
    }

    public void writeToFile(List<Map> data, File file, boolean append) throws IOException {
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file, append)));
        formatter.encode(data, out);
        out.close();
    }

    public static void main(String[] args) {
        TextWriter write = new TextWriter(new GarageTotalsFormatter());
        Map<String, String> map = new HashMap<>();
        map.put("265", "1987");
        List<Map<String, String>> data = new ArrayList();
        data.add(map);
//        System.out.println(data.get(0));
// 
//        write.writeToFile(data, new File("src/garageFormatTest.txt"), false);
//        System.out.println(ex.getMessage());

    }
}
