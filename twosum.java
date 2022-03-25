import java.util.HashMap;
class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int len = nums.length;
        int temp;
        HashMap<Integer, Integer> gg = new HashMap<Integer, Integer>();
        for (int i=0;i<len;i++){
            temp = target-nums[i];
            if (gg.containsKey(temp)){
                ans[0] = i;
                ans[1] = gg.get(temp);
            }
            else {
                gg.put(nums[i], i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] test = {3,2,4};
        int[] ans = twoSum(test, 6);
        for(int i: ans){
            System.out.println(i);
        }
        

    }
}