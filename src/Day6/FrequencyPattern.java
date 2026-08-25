package Day6;
import java.util.HashMap;
public class FrequencyPattern {
    public static void main(String[] args){
        int[] arr={10,20,10,30,20,10};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int value:arr){
            map.put(
                    value, map.getOrDefault(value,0)+1
            );
        }
        System.out.println(map);
    }

}
