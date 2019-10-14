package offer;

/**
 * 面试题 8:旋转数组的最小数字
 * 题目描述:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数 组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1.
 */
public class Problem8 {
    public static void main(String[] args) {
        int[] array = new int[]{1,0,1,1,1};
        int res = findMinNum(array);
        System.out.println(res);
    }

    private static Integer findMinNum(int[] array) {
        if (array == null)
            return null;
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int mid = 0;
        while(array[leftIndex]>=array[rightIndex]){
            if(rightIndex-leftIndex<=1){ mid=rightIndex;
                break;
            }
            mid=(leftIndex+rightIndex)/2;
            if(array[leftIndex]==array[rightIndex]&&array[leftIndex]==array[mid]){
                if(array[leftIndex+1]!=array[rightIndex-1]){ mid=array[leftIndex+1]<array[rightIndex-1]?(leftIndex+1):(rightIndex-1);
                    break;
                }else{
                    leftIndex++;
                    rightIndex--;
                }
            }else{
                if(array[mid]>=array[leftIndex])
                leftIndex=mid;
                else {
                if(array[mid]<=array[rightIndex]) rightIndex=mid;
            }
            }
        }
        return array[mid];
    }
}
