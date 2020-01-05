package com.code.any.s859;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-01 17:55
 */
public class Solution {
    public boolean buddyStrings(String A, String B) {
        int Al = A.length();
        int Bl = B.length();
        if(Al != Bl || Al < 2 )
            return false;
        char A1 = 0,A2 =0 ,B1 = 0,B2 = 0;
        int time = 0;
        boolean ifDouble = false;
        for(int i=0 ;i<Al;i++){
            char Ai = A.charAt(i);
            char Bi = B.charAt(i);
            if(!ifDouble){
                for(int j=i+1 ;j<Al;j++ ){
                    if( Ai == A.charAt(j)){
                        ifDouble = true;
                        break;
                    }
                }
            }
            if(Ai == Bi){
                continue;
            }else{
                time++;
                if(time == 1){
                    A1 = Ai;
                    B1 = Bi;
                }else if(time == 2){
                    A2 = Ai;
                    B2 = Bi;
                }else if(time>2){
                    return false;
                }
            }
        }
        if(time == 2 && A1 == B2 && A2 == B1){
            return true;
        }else if (time == 0 && ifDouble){
            return true;
        }


        return false;
    }
}
