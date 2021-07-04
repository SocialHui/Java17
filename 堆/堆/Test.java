public class Test {
    /**
     * 建堆
     * 向下调整
     * 向上调整
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        //建堆
        createHeap(array,array.length);

        //出队，获取最小的数字
        int num = get(array,array.length);

        //入队
        push(array,array.length,10);
    }

    /**
     * 建小堆
     * 建堆的过程就是向下调整的过程，只不过是从最后一个节点的夫节点开始向下调整的
     * @param arr
     * @param size
     */
    public static void createHeap(int[] arr, int size) {
        int index = (size-1-1)/2;   //父节点的下标
        while (index >= 0) {
            shiftDown(arr,size,index--);
        }
    }

    /**
     * 向下调整
     * @param arr
     * @param size
     * @param index
     */
    public static void shiftDown(int[] arr, int size, int index) {
        int child = index*2+1;
        while (child < size) {
            int min = child;
            if (child+1 < size) {
                if (arr[child+1] < arr[child]) {
                    min = child+1;
                }
            }
            if (arr[min] < arr[index]) {
                //进行交换
                int tmp = arr[min];
                arr[min] = arr[index];
                arr[index] = tmp;
            }
            index = min;
            child = index*2+1;
        }
    }

    /**
     * 出队
     * 出队的时候出去的是最顶端的数字，最顶端的数字不能直接出去，如果直接出去的话破坏了堆的结构
     * @return
     */
    public static int get(int[] arr,int size) {
        //先进行交换
        int tmp = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = tmp;

        shiftDown(arr,size,0);
        size--;
        return arr[size];
    }

    /**
     * 入队
     * @param arr
     * @param size
     */
    public static void push(int[] arr,int size, int num) {
        size++;
        arr[size] = num;
        shiftUp(arr,size);
    }

    public static void shiftUp(int[] arr, int size) {
        while (size > 0) {
            int parent = (size - 1) / 2;
            if (arr[parent] <= arr[size]) {
                break;
            }
            
            int tmp = arr[parent];
            arr[parent] = arr[size];
            arr[size] = tmp;
            
            size = parent;
        }
    }
}
