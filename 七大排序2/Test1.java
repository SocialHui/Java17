import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1,3,9,7,5,11,2,4};
        //insert(nums);
        //shell(nums);
        //bubbleSort(nums);
        //bubble(nums);
        //sort1(nums);
        mergeSort(nums,0,nums.length-1);

        /*for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }*/
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 归并排序
     * 归并排序的思想就是将数组里面的数字分成1个1个的数字，然后进行合并
     * 分为1个1个的数字也就是对下标进行分，将下表分为1个1个的下标
     *
     */
    public static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left+right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        //走到这里代表已经分解为1个1个的了，接下来要进行合并了
        merge(nums,left,right,mid);
    }

    public static void merge(int[] nums, int left, int right, int mid) {
        int i = left;
        int j = mid+1;
        int len = right-left+1;
        int k = 0;
        int[] tmps = new int[len];

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tmps[k++] = nums[i++];
            } else {
                tmps[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            tmps[k++] = nums[i++];
        }
        while (j <= right) {
            tmps[k++] = nums[j++];
        }

        j = left;
        i = 0;
        for (; j <= right; j++) {
            nums[j] = tmps[i++];
        }
    }


    public static void sort1(int[] nums) {
        quickSort1(nums,0,nums.length-1);
    }

    public static void quickSort1(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = piv(nums,left,right);
        quickSort1(nums,left,pivot-1);
        quickSort1(nums,pivot+1,right);
    }

    public static int piv(int[] nums, int left, int right) {
        int i = left;
        int j = right;
        int num = nums[left];
        while (i < j) {
            while (i < j && nums[j] >= num) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= num) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = num;
        return i;
    }


    /**
     * 快排
     * 快排的思想就是找一个基准值，然后分而治之，比这个基准值小的数字放在一边，对两边分别进行排序
     * 这里的代码就是将最左边的值作为基准值
     * 空间复杂度就是他需要额外开辟的空间，就是树的高度log以2为底的n
     * 时间复杂度：完全有序的时候，他的时间复杂度越大，是on的平方
     * 快排是不稳定的排序，有跨越式的交换
     */
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int piv = pivot(array, left, right);
        quickSort(array, left, piv - 1);
        quickSort(array, piv + 1, right);
    }

    public static int pivot(int[] nums, int left, int right) {
        int pivot = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= pivot) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        return i;
    }




    /**
     * 冒泡排序
     * 冒泡将最大的数字或者最小的数字放到最后
     * 时间复杂度：on的平方
     * 空间复杂度：o1
     * 是稳定的排序
     */
    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j-1] > nums[j]) {
                    int num = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = num;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }


    /**
     * 选择排序
     * 选择排序的思想就是找出来最大的或者最小的数字放到最后
     * 遍历找出最大的，将最大的数字放到最后，
     * 时间复杂度：on的平方
     * 空间复杂度：o1
     * 是不稳定的排序
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = 0;   //最大的数字的下标
            boolean flag = true;
            for (int j = 0; j < nums.length-i; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            int num = nums[max];
            nums[max] = nums[nums.length-i-1];
            nums[nums.length-1-i] = num;
        }
    }


    //希尔排序，希尔排序就是在直接插入排序上的优化，因为直接插入排序是越有序，越快
    //时间复杂度on的平方
    //空间复杂度o1
    //是属于不稳定的排序，因为有跳跃式的交换
    public static void shell(int[] nums) {
        int[] tag = {5,3,1};
        for (int i = 0; i < tag.length; i++) {
            shellSort(nums,tag[i]);
        }
    }

    public static void shellSort(int[] nums, int tag) {
        for (int i = tag; i < nums.length; i++) {
            int num = nums[i];
            int j = i-tag;
            for (; j >= 0; j-=tag) {
                if (num < nums[j]) {
                    nums[j+tag] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+tag] = num;
        }
    }


    //直接插入排序
    //直接插入排序的时间复杂度是on的平方
    //空间复杂度是o1
    //适用于越有序的数字排序
    //稳定的排序，但是要注意排序的时候的条件，如果条件中的<有改变，就会导致变成不稳定的排序
    //直接插入排序一般用在一些排序的优化上面
    //如果数据有序，他的时间复杂度是on
    public static void insert(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (num < nums[j]) {
                    nums[j+1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+1] = num;
        }
    }
}
