public class binary {
    static public int  search(int[] nums, int target){
        int length = nums.length;
        int start = 0;
        int end = length-1;
        int mid = (start+end)/2;
        while(start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[end]==target)
                return end;
            if(nums[start]==target)
                return start;
            if(mid==start || start==end){
                return -1;
            }
            else if(nums[mid]<target){
                start=mid;
            }
            else if(nums[mid]>target){
                end=mid;
            }
            }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3};
        System.out.println(search(arr, 3));
    }
}
