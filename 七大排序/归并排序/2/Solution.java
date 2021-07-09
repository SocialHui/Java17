//归并排序
    public static void mergeSort(int[] array){
        //先进行分解
        mergeSortInternal(array,0,array.length-1);
    }

    private static void mergeSortInternal(int[] array, int low, int high) {
        if (high-1 < low) {
            return;
        }

        int mid = (low+high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);

        //将数据都分割成1个以后进行归并
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid+1;

        int len = high-low+1;
        int[] nums = new int[len];
        int k = 0;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                nums[k++] = array[i++];
            } else {
                nums[k++] = array[j++];
            }
        }

        while (i <= mid) {
            nums[k++] = array[i++];
        }

        while (j <= high) {
            nums[k++] = array[j++];
        }

        j = 0;
        for (int l = low; l <= high; l++) {
            array[l] = nums[j++];
        }
    }