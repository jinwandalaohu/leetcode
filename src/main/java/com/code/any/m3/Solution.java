package com.code.any.m3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import sun.security.provider.Sun;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-02 22:00
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        char[] ss = s.toCharArray();
        int[] index = new int[128];
        int len = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            for (int j = left; j < i; j++) {
                if (ss[j] == ss[i]) {
                    len = Math.max(len, i - left);
                    left = j + 1;
                    break;
                }
            }
        }
        return Math.max(n-left, len);
    }
}
