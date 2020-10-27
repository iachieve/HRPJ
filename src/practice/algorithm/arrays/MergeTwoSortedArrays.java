package practice.algorithm.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 6};
        int[] arr2 = {3,4,7};
        System.out.println(Arrays.equals(new int[]{1 ,2 ,3, 4, 5, 6, 7},  mergeArrays(arr1, arr2)));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < arr1.length && i2 < arr2.length){
            if(arr1[i1] <= arr2[i2]){
                list.add(arr1[i1]);
                i1++;
            }else{
                list.add(arr2[i2]);
                i2++;
            }
        }
       while(i1 < arr1.length){
           list.add(arr1[i1]);
           i1++;
       }
        while(i2 < arr2.length){
            list.add(arr2[i2]);
            i2++;
        }
        System.out.println(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
