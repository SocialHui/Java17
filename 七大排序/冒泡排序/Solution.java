public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length-1-i; j++) {
                //从小到大排序
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }

            if (flag) {   //成立代表已经有序了，不需要继续了
                break;
            }
        }
    }