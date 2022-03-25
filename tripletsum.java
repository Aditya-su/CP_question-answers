import java.util.ArrayList;
import java.util.List;

class tripletsum {
    public static List<ArrayList<Integer>> threeSum(int[] nums) {
        List<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int len = nums.length;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<len-2;i+=2){
            for(int j=i+1;j<len-1;j+=1){
                for(int k=j+1;k<len;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);
                    }
                }
            }
        }
        ans.add(temp);
        return ans;
    }
    public static void main(String[] args) {
        int[] temp = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(temp));
    }
}