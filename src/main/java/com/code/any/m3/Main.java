package com.code.any.m3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-02 22:12
 */
public class Main {
    Solution solution = new Solution();

    @Test
    public void test() {
        assertEquals(2, solution.lengthOfLongestSubstring("aba"));
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
        assertEquals(2, solution.lengthOfLongestSubstring("ab"));
        assertEquals(2, solution.lengthOfLongestSubstring("cbb"));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }
}
