package Weekly.Week3;

import java.util.Arrays;

public class RainWaterTrap {
    /**
     * <h2>Rain water trap</h2>
     * @param height of the building
     * @return unit of water trapped
     * BigO(10+13n)
     */
    public static int trap(int[] height){
        int ans = 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for (int i = 1; i < n; i++)leftMax[i] = Math.max(height[i], leftMax[i-1]);
        for (int i = n-2; i >= 0; i--) rightMax[i] = Math.max(height[i],rightMax[i+1]);
        for (int i = 0; i < n; i++) ans += (Math.min(leftMax[i], rightMax[i])-height[i]);
        System.out.println(Arrays.toString(rightMax) + " " + Arrays.toString(leftMax));
        return ans;
    }
}
