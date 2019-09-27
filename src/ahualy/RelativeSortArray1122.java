package ahualy;

import java.util.*;

/**
 * 解题思路
 * 首先找到和arr2中元素一样的存入list中，同时给arr2座一个map存储
 * 通过map找出arr1中不在arr2中的元素，同时存入list1,
 * 对list1进行排序，Collection.sort()
 * 将List1中的数据添加到list中
 * 将list转化为int[]
 */
public class RelativeSortArray1122 {
    public static void main(String args[]){
        int arr1[] = new int[]{2,3,1,3,2,4,6,19,9,2,7};
        int arr2[] = new int[]{2,1,4,3,9,6};
        int[] res = relativeSortArray(arr1,arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr2 == null){
            Arrays.sort(arr1);
            return arr1;
        }
//      list中存放存在的数字
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i],1);
            //将所有数字保存到map中
            for (int j = 0; j < arr1.length; j++) {
                //判断如果相等了
                if (arr2[i] == arr1[j]) {
                    list.add(arr1[j]);
                }
            }
        }
//      查找不存在的数字
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.get(arr1[i]) == null){
                list1.add(arr1[i]);
            }
        }
        Collections.sort(list1);
        for (int i = 0; i < list1.size() ; i++) {
           list.add(list1.get(i));
        }
        int[] d = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            d[i] = list.get(i);
        }
        return d;
    }
}