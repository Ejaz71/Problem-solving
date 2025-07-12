import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] a = {7,3,5,9,2,7,5,1,1,2,0,9,4,6,3,1,8,0,11};
        int[] b = {6,3,11, 5,6,6,6,1,8,0,11};
        System.out.println(Arrays.toString(intersection(a,b)));
        System.out.println(Arrays.toString(intersection2(a,b)));
    }

    static private int[] intersection(int[] nums1, int[] nums2) {
        // using hashset, time O(n), space O(n)
        int k=0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) set1.add(i);
        for (int j : nums2) {
            if (set1.contains(j)) set2.add(j);
        }
        int[] intersection = new int[set2.size()];
        for (int i : set2) intersection[k++] = i;
        return intersection;
    }

    static int[] intersection2(int[] nums1, int[] nums2) {
        // sorting time : O(n lg n + m lg m), space O(1)
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        Set<Integer> intersection = new HashSet<>();
        while (i < nums1.length && j < nums2.length ) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) i++;
            else j++;
        }
        int[] res = new int[intersection.size()];
        for (int n : intersection) {
            nums1[k++] = n;
        }
        return Arrays.copyOf(nums1, k);
    }

}
