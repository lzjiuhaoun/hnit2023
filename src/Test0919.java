public class Test0919 {
    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    //    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//
//        System.out.println("排序前:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        bubbleSort(arr);
//
//        System.out.println("\n排序后:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
    public static void main(String[] args) {
        int m=1;
        m=m--; //结果是相当于m=m
        m=m++; //结果是相当于m=m
        System.out.println(m);
        if(1==1) {
            System.out.println("af");
        }
    }
}
