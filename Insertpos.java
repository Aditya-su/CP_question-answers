public class Insertpos {
    static public int searchInsert(int[] nums, int target){
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (target<=nums[i]){
                return index;
            }
            else if(target>nums[i]){
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] testarr = {1,2,3,4,5};
        int tar = 6;
        System.out.println(searchInsert(testarr, tar));
    }
}
