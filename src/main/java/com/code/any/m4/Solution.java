package com.code.any.m4;


import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac.IntegrityHmacRIPEMD160;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.DetailEntry1_1Impl;
import sun.security.util.Length;

/**
 * 描述:
 *
 * @author iceiceice
 * @since 2020-01-03 15:53
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int len = l1+l2;
        int leftK = (len+1)/2;
        int rightK = (len+2)/2;

        return (getK(nums1,0, l1-1, nums2,0,l2-1,leftK)+getK(nums1,0, l1-1, nums2,0,l2-1,rightK))/2.0;

    }
    public int getK(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int k){
        int l1 = end1 - start1+1;
        int l2 = end2 - start2 +2;
        if(l1>l2){
            return getK(nums2,start2,end2,nums1,start1,end1,k);
        }
        if( 0 == l1 ){
            return nums2[start2+k-1];
        }
        if(1 == k){
            return Math.min(nums1[start1],nums2[start2]);
        }
        int i = start1+Math.min(l1,k/2) -1;
        int j = start2+Math.min(l2,k/2) -1;

        if(nums1[start1]> nums2[start2]){
            return getK(nums1,start1,end1,nums2,j+1,end2,k-(j-start2+1));
        }else{
            return getK(nums1,i+1, end1,nums2,start2,end2, k-(i-start1+1));
        }

    }

}
