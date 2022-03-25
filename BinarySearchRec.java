public class BinarySearchRec {
    public static int binarySearch(int[] nums, int target, int min, int max){
        if (min==max-1 && nums[max]!= target)
            return -1;
        int mid = (min+max)/2;
        if (nums[max]==target)
            return max+1;
        if (nums[mid]==target)
            return mid+1;
        else if (nums[mid]<target){
            return binarySearch(nums, target, mid, max);
        }
        else if(nums[mid]>target){
            return binarySearch(nums, target, min, mid);
        }
        return mid+1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,10,11};
        int target = 11;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
}
