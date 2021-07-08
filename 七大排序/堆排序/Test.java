public static void heapSort(int[] array) {
        createHeap(array);
    }

    //建小堆
    private static void createHeap(int[] array) {
        /**
         * 创建堆的时候,是从最后一个节点的父节点开始的向下调整
         * 大根堆就是父节点的大小大于两个子节点的大小
         * 小根堆就是父节点的大小小于两个子节点的大小
         */
        int i = (array.length-1-1)/2;
        for (; i >= 0; i--) {
            //从最后一个节点的父节点开始向下调整
            shiftDown(array, i);   //i代表开始向下调整的节点
        }
    }

    //向下调整
    private static void shiftDown(int[] array, int parent) {
        int child = parent*2+1;   //代表的是左孩子
        while (child < array.length) {    //向下调整一直要调整到二叉树的最下面
            if (child + 1 < array.length) {
                //进行判断哪个孩子大
                if (array[child + 1] < array[child]) {
                    child = child + 1;
                }
            }

            //开始判断大孩子和父节点的大小
            if (array[parent] > array[child]) {
                //进行交换
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            }

            parent = child;
            child = parent*2+1;
        }
    }