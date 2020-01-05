package com.code.any.s860;


/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-01 18:58
 */
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5)
            return false;
        int c5=0,c10=0;
        for(int c : bills){
            if(c == 5){
                c5++;
            }else if(c == 10){
                c10++;
                c5--;
            }else {
                if(c10>0){
                    c10--;
                    c5--;
                }else{
                    c5 = c5 -3;
                }
            }
            if(c5<0 || c10<0 ){
                return false;
            }
        }
        return true;
    }
}
