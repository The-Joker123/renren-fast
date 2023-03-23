package Sort;

/**
 * @author OverChat
 * @date
 */

import java.util.Random;

/**
 * @author OverChat
 * @date
 */
public class QuickSort {

    static int count=0;
    public int[] sortArray(int[] nums) {

        //排序的数组为null或者长度小于等于1
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        QuickSoft(nums,0,nums.length-1);

        return nums;
    }
    public void QuickSoft(int[] arr, int start, int end){
        System.out.println("次数"+count++);

        if (start >= end) {
            return;
        }
        int p= Partition(arr, start, end);
        QuickSoft(arr, start, p - 1);
        QuickSoft(arr, p + 1, end);

    }
    public int Partition(int[] arr, int start, int end) {

        //随机选取一个枢轴，降低最坏时间复杂度
        int r=new Random().nextInt(end-start+1)+start;
        //将随机取得枢轴位置替换
        int temp=arr[start];
        arr[start]=arr[r];
        arr[r]=temp;

        int pivot = arr[start];
        int i = start, j = end;
        while (i < j) {
            //后驱index大于枢轴元素就前进
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            //后驱元素赋值到前驱元素
            arr[i] = arr[j];
            //前驱index要小于枢轴
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            //后驱元素赋值到前驱元素
            arr[j] = arr[i];
        }
        //最后把枢轴放到前驱index下
        arr[i] = pivot;
        //分值思想：递归调用
        return i;
    }


    public static void main(String[] args) {

        // 开始时间
        long stime = System.currentTimeMillis();

        int[] a=new int[2000];
        a[0]=3;
        for (int i = 1; i <1000 ; i++) {
            a[i]=2;
        }
        System.out.println(a.length);
        QuickSort quickSort =new QuickSort();
        int[] b= quickSort.sortArray(a);

        System.out.println(b.length);
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+" ");
        }
        // 结束时间
        long etime = System.currentTimeMillis();
        // 计算执行时间
        System.out.println();
        System.out.printf("执行时长：%d 毫秒.", (etime - stime));
    }
}
