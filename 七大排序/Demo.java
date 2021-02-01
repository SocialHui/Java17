public class Demo {

    //选择排序
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }


    //希尔排序
    public static void shellSort(int[] array) {
        int[] drr = {7,5,1};//增量数组
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void shell(int[] array ,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >=0 ; j -= gap) {
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

}
