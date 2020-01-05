package com.code.any.s665;

import com.sun.deploy.panel.NumberDocument;
import sun.print.SunMinMaxPage;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2019-12-31 11:03
 */
public class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length < 3){
            return true;
        }
        int time = 0;
        for(int i=0;(i+1)<nums.length;i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                time++;
                if (time > 1) {
                    return false;
                }

                if(i ==0 ){
                    nums[i] = nums[i+1];
                    continue;
                }
                //i的前一位大于后一位，只能把后一位改大
                if (i >=1 && nums[i - 1] >= nums[i + 1]) { // 5  6  4  8         768   756
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
