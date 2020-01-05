package com.code.any.s665;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2019-12-31 11:02
 */
public class Main {
    Solution solution = new Solution();
    @Test
    public void test1(){
        assertAll("",
            () -> assertTrue(solution.checkPossibility(new int[]{4,2,3})),
            () -> assertFalse(solution.checkPossibility(new int[]{4,2,1})),
            () -> assertFalse(solution.checkPossibility(new int[]{3,4,2,3})),
            () -> assertTrue(solution.checkPossibility(new int[]{2,3,3,2,4}))
            );
    }
}
