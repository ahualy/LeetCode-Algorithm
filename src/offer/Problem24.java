package offer;

import java.util.Arrays;

/**
 *面试题 24:二叉搜索树的后序遍历序列
 *题目:输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。 是则返回true，否则返回false。
 *
 * 什么是二叉搜索树
 * 每个父节点都有两个子节点（子节点可能为空），左子节点比父节点小，右子节点比父节点大。
 */
public class Problem24 {
    public static void main(String[] args) {
        int[] array={5,7,6,9,11,10,8};
        boolean res = verfiySequenceOfBST(array);
        System.out.println(res);
    }

    private static boolean verfiySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        int length = sequence.length;
//        root 输入序列的最后一个值,也就意味着root是二叉排序树的根节点
        int root = sequence[length - 1];
        int cut = 0;
        for (int i=0;i<length-1;i++) {
            //切分左右子数，因为二叉搜索树的右边的所有节点的值都是大于根节点的
            // 如果这个序列基本满足二叉搜索树，这样的话就是只会左边的树一定是小于右边的树，但是这里还无法判断，不能够保证所有的左子数小于右子数
            if (sequence[i] > root) {
                cut = i + 1;
                break;
            }
        }
        // cut等于0说明是没有右子树
        if (cut==0) {
            verfiySequenceOfBST(Arrays.copyOfRange(sequence,0,length-1));
        } else {
            //进一步判断，是不是所有的大于cut下标的值都大于root，如果不是，就直接返回false，说明这个序列就不是二叉搜索树的后序遍历结果
            for (int j = cut; j <length-1 ; j++) {
                if (sequence[j] < root) {
                    return false;
                }
            }
        }
        boolean left = true;
        if (cut > 0)
            left = verfiySequenceOfBST(Arrays.copyOfRange(sequence,0,cut));
        boolean right = true;
        if (cut < length-1)
            right = verfiySequenceOfBST(Arrays.copyOfRange(sequence,cut,length-1));
        return left&&right;
    }
}
