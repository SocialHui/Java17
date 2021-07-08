public static void selectSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int maxI = 0;   //代表最大值的下标
            for (int j = 0; j < array.length-i; j++) {
                if (array[j] > array[maxI]) {
                    maxI = j;
                }
            }
            int tmp = array[maxI];
            array[maxI] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }
    }