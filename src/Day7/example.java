package Day7;
import java.util.HashMap;
public class example {
        public static void main(String[] args){
            HashMap<String, Integer>marks = new HashMap<>();
            marks.put("John",85);
            marks.put("Alice",90);
            marks.put("Bob",75);
            System.out.println("John's marks: "+ marks.get("John"));
            System.out.println("Is Alice present? "+marks.containsKey("Alice"));
            marks.put("John",95);
            System.out.println("Updated John marks: "+ marks.get("John"));
            marks.remove("Bob");
            System.out.println("Final Map: "+ marks);
        }
    }
