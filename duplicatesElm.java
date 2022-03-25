import java.util.HashMap;

public class duplicatesElm {
    static public int singleNumber(int[] nums){
        HashMap<Integer, Integer> gg = new HashMap<Integer, Integer>();
        for (int i: nums){
            gg.put(i, gg.getOrDefault(i, 0)+1);
        }
        for(java.util.Map.Entry<Integer, Integer> entry: gg.entrySet()){
            if (entry.getValue()==1)
                return entry.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1};
        System.out.println(singleNumber(nums));
    }
}
