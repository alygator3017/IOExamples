package inclasswork;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ajSchmidt-Zimmel
 */
public interface TextFormatStrategy {

    //job of this is to encode and decode
    //decode
    public abstract List<Map> decode(String data);
    
    //encode
    public abstract void encode(List<Map> data, PrintWriter out);
    
}
