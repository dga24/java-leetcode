package removeDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class main {

    public static void main(String[] args){
      // TODO document why this method is empty

      int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
      ;
      System.out.println(removeDuplicates(nums));
    }



    public static int removeDuplicates(int[] nums) {
        SortedMap<Integer,Integer> sortedMap = new TreeMap<>();
        
        for (int i : nums) {
            sortedMap.put(i, 1);
        }

        Iterator<Map.Entry<Integer, Integer>> it = sortedMap.entrySet().iterator();

        System.out.println(it.toString());

        int j = 0;

        while(it.hasNext()){
            nums[j] = it.next().getKey();
            j++;
        }
        
        return j;
    }


    public static void mapTest(){
        Map<Integer,String> map = new HashMap<>();
		map.put(10, "Ten");
		map.put(100, "Hundred");
		map.put(1000, "Thousand");

        for (Iterator<Map.Entry<Integer,String>> entries = map.entrySet().iterator(); entries.hasNext();){
            Map.Entry<Integer,String> entry = entries.next();
            System.out.println(entry.getKey() + ":" + entry.getValue() );
        }
    }
}