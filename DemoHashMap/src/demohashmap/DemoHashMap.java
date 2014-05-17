
//Demo HashMap

package demohashmap;

//Import thư viện
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Small
 */
public class DemoHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Khởi tạo HashMap
        //Khởi tạo từ interface Map, chưa định nghĩa kiểu giá trị
        Map hm1 = new HashMap();
        
        //Khởi tạo từ interface Map, đã định nghĩa kiểu giá trị
        Map<Integer, String> hm2 = new HashMap<>();
        
        //Khởi tạo từ HashMap, chưa định nghĩa kiểu giá trị
        HashMap hm3 = new HashMap();
        
        //Khởi tạo từ HashMap, đã định nghĩa kiểu giá trị
        HashMap<Integer, String> hm4 = new HashMap<>();
        HashMap hm5 = new HashMap<Integer, String>();
        HashMap<Integer, String> hm6 = new HashMap<Integer, String>();
        
    }
    
}
