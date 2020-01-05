package com.code.any.m4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-03 16:12
 */
public class Main {
    Solution solution = new Solution();
    @Test
    public void test(){
        Assertions.assertEquals(2.0,solution.findMedianSortedArrays(new int[]{1,3},new int[]{2}) );
        Assertions.assertEquals(2.5,solution.findMedianSortedArrays(new int[]{1,3},new int[]{2,4}) );
        Assertions.assertEquals(2.5,solution.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}) );
    }
}
