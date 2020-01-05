package com.code.any.m2;

import java.nio.channels.NonWritableChannelException;
import java.rmi.server.RMIClassLoader;

/**
 * 描述:
 *
 * @author iceiceice
 * @create 2020-01-01 19:11
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r_index = new ListNode(0);
        ListNode res = r_index;
        int n1 = 0, n2 = 0,n_add=0,index = 0;
        while (l1 != null || l2 != null) {
            index++;
            n1 = l1 == null ? 0 : l1.val;
            n2 = l2 == null ? 0 : l2.val;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            int n3 = n1 + n2 + n_add;
            ListNode m_temp;

            if (n3 >= 10) {
                n_add = 1;
                m_temp = new ListNode(n3 - 10);
                r_index.next = m_temp;
                r_index = m_temp;
            } else {
                n_add = 0;
                m_temp = new ListNode(n3);
                r_index.next = m_temp;
                r_index = m_temp;
            }
        }
        if(n_add == 1){
            r_index.next = new ListNode(1);
        }

        return res.next;
    }
}
