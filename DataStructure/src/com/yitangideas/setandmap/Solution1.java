package com.yitangideas.setandmap;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * leetcode 349
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 */
public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums1){
            treeSet.add(num);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums2){
            if(treeSet.contains(num)){
                arrayList.add(num);
                treeSet.remove(num);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}












