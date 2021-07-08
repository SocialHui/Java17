//快速排序
    public static void quickSort(int[] array) {
        int left = 0;
        int right = array.length-1;
        quickSortInternal(array,left,right);
    }

    public static void quickSortInternal(int[] array, int left, int right) {

        //递归的方式实现的
        /*if (left >= right) {
            return;
        }

        int pivot = partition(array,left,right);
        quickSortInternal(array,left,pivot-1);
        quickSortInternal(array,pivot+1,right);*/


        /**
         * 非递归的方式实现快排
         * 递归改非递归一般都用到了栈
         * 栈里面存放的是待排序的数据的下标的范围
         */

        Stack<Integer> stack = new Stack<>();
        stack.push(right);
        stack.push(left);
        
        while (!stack.isEmpty()) {
            left = stack.pop();
            right = stack.pop();
            
            //重要的一步
            if (left >= right) {
                continue;
            }
            
            int pivot = partition(array,left,right);
            stack.push(right);
            stack.push(pivot+1);
            
            stack.push(pivot-1);
            stack.push(left);
        }

    }

    public static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        i++;
        while (i < j) {
            while (i < j && array[j] > pivot) {
                j--;
            }
            while (i < j && array[i] < pivot) {
                i++;
            }

            //到这就可以交换了
            swap(array,i,j);
        }
        swap(array,left,i);
        return i;    //返回基准值的位置
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }