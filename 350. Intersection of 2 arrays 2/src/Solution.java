import java.util.*;

public class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // using 2 maps
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int m, k = 0;
        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        for (int i : map1.keySet()) {
            if (map2.containsKey(i)) {
                m = map1.get(i) < map2.get(i) ? map1.get(i) : map2.get(i);
                for (int j = 0; j < m; j++) {
                    res.add(i);
                }
            }
        }
//        int[] resArray = new int[res.size()];
//        for (int i : res) resArray[k++] = i;
//        return resArray;
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        //using only 1 map
        Map<Integer, Integer> map= new HashMap<>();
        List<Integer> intersectList = new ArrayList<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            if(map.containsKey(i) && map.get(i) > 0) {
                intersectList.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        return intersectList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersect3(int[] nums1, int[] nums2) {
        // if the arrays are sorted
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                ans[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) j++;
            else i++;
        }
        return Arrays.copyOf(ans,k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,1,6,6,3,3,3,0,0,0,33,33,1,6,5,7,5,4};
        int[] nums2 = {6,33,4,1,8,6,1,3,2,4,11,33,33,6,33};
        int[] nums3 = {4,4,5,5,5,5,5,5,5,6,7,8,9,9,9,9,10};
        int[] nums4 = {1,1,1,1,1,1,1,4,5,5,8,8,8,8,8,8,8,10,11,12,13};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        System.out.println(Arrays.toString(intersect2(nums1, nums2)));
        System.out.println(Arrays.toString(intersect3(nums3, nums4)));
    }

}
