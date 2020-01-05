package com.code.any.s859;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-01 17:54
 */
public class Main {
    Solution solution = new Solution();
    @Test
    public void test(){
        assertAll("",
            () -> assertTrue(solution.buddyStrings("ab", "ba")),
            () -> assertTrue(solution.buddyStrings("aa", "aa")),
            () -> assertFalse(solution.buddyStrings("ab", "ab")),
            () -> assertTrue(solution.buddyStrings("aaaaaaabc", "aaaaaaacb"))
            );
    }
}
