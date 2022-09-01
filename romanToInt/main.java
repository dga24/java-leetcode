package romanToInt;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        
    }

    public static int romanToInt(String s){
        HashMap<String,Integer> symbolMap = new HashMap<>();
        symbolMap.put("M", 1000);
        symbolMap.put("D", 500);
        symbolMap.put("C", 100);
        symbolMap.put("L", 50);
        symbolMap.put("X", 10);
        symbolMap.put("V", 5);
        symbolMap.put("I", 1);

        int res = 0;

        String[] input = s.split("");

        for (int i = 0; i < input.length; i++) {
            if (i>0 && (symbolMap.get(input[i-1])<symbolMap.get(input[i]))) {
                res -= symbolMap.get(input[i-1]);
                res += (symbolMap.get(input[i])-symbolMap.get(input[i-1]));
            }else{
                res += symbolMap.get(input[i]);
            }
        }
        return res;
    }
}
