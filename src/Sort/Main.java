package Sort;

import static Sort.SortingUtil.randIntArr;

public class Main {

    public static void main(String[] args) {
        int[] testArr = randIntArr(4);
        int[] before = testArr;

        System.out.println("Before: ");
        for (int num: testArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        SortingUtil.bubbleSort(testArr);

        int[] after = testArr;
        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        boolean isSortedVAR =  SortingUtil.isSorted(testArr);
        System.out.println(isSortedVAR);

        boolean isCheckedVAR = SortingUtil.checkSum(before, after);
        System.out.println(isCheckedVAR);

        long time = System.nanoTime();
        SortingUtil.bubbleSort(before);
        time = System.nanoTime() - time;
        System.out.println("Time Taken for bubblesort: " + time);
    }


}

