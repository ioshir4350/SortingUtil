package Sort;


public class SortingUtil {

    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 10001);
        }
        return arr;
    }

    public static void swap(int[] testarr, int i, int j) {
        int x = testarr[i];
        testarr[i] = testarr[j];
        testarr[j] = x;
    }

    public static void bubbleSort(int[] testarr) {
        int c = 1;
        while (c > 0) {
            c = 0;
            for (int b = 0; b < testarr.length - 1; b++) {
                if (testarr[b] > testarr[b + 1]) {
                    swap(testarr, b, b + 1);
                    c++;
                }
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int b = 0; b < arr.length - 1; b++) {
            if (arr[b] < arr[b + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
        for (int b = 0; b < before.length - 1; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length - 1; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum) {
            return true;
        }
        else
            {
            return false;
        }
    }
}



