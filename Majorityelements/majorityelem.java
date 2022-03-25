package Majorityelements;

import java.util.HashMap;

public class majorityelem {
    
    public static int major(int[] arr, int size){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (int i:map.keySet()){
            if(map.get(i)>size/2)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        int size = arr.length;
        System.out.println(major(arr, size));   

    }
}
