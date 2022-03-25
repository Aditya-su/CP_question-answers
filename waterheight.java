
import java.lang.Math;

public class waterheight {
    static public int maxArea(int[] height){
        int maxarea=0;
        int len = height.length;
        int i=0;
        int j=len-1;
        while(i!=j){
            
            if (height[i]<=height[j]){
                maxarea = Math.max(maxarea, height[i]*(j-i));
                i++;
            }
            else if (height[i]>height[j]){
                maxarea = Math.max(maxarea, height[j]*(j-i));
                j--;
            }
        }
        return maxarea;
        
    }
    public static void main(String[] args) {
        int[] h = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(h));
    }
}
