import java.util.HashMap;
import java.util.Map;

public class MemoryLeak {

		   private Map cache = new HashMap();
		   public int square(int i) {
		      int result = i * i;
		      cache.put(i, result);
		      return result;
		   }
		   public static void main(String[] args) throws Exception {
			   int i=0;
			   MemoryLeak ml = new MemoryLeak();
		      while (true) {
		        i = i+1; 
		        
		         System.out.println(ml.square(i));
		      }
		   }
		
}
