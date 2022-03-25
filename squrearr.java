public class squrearr {
    static public int[] sortedSquares(int[] nums) {
        int o = nums.length;
        int[] ans = new int[o];
        int i=0,j=0;
        int k=0;
        while (i<nums.length-1 && nums[i]<0){
            
            i++;
            j++;
            if (nums[i]>0 && Math.abs(nums[i-1])<=nums[i]){
                i--;
                j--;
                break;
            }
        }
        ans[k]=nums[i]*nums[i];
        k++;
        i--;
        j++;
        
        while (i>=0 && j<nums.length){
            if (Math.abs(nums[i])<nums[j]){
                ans[k]=nums[i]*nums[i];
                k++;
                i--;
            }
            else {
                ans[k] = nums[j]*nums[j];
                k++;
                j++;
            }
        }
        while (i>=0){
            ans[k] = nums[i]*nums[i];
            k++;
            i--;
        }
        while (j<nums.length){
            ans[k] = nums[j]*nums[j];
            k++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] test = {-1,2,2};
        
        for (int x:sortedSquares(test))
            System.out.println(x);
    }
}