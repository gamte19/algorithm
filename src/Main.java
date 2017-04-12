import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sortedList = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Normal " + binarySearch.search(sortedList, 5));
        System.out.println("Recursive " + binarySearch.binarySearchRecursive(sortedList, 5, 0, sortedList.length));

        System.out.println("-----------------------------");
        int bubbleList[] = {15, 3, 9, 19, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(bubbleList));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSor(bubbleList);
        System.out.println(Arrays.toString(bubbleList));

        System.out.println("-----------------------------");
        int mergeList[] = {15, 3, 9, 19, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(mergeList));
        Mergesort mergesort = new Mergesort();
        mergesort.sort(mergeList);
        System.out.println(Arrays.toString(mergeList));

        System.out.println("-----------------------------");
        Quicksort quicksort = new Quicksort();
        int quickList[] = {15, 3, 9, 19, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(quickList));
        quicksort.sort(quickList);
        System.out.println(Arrays.toString(quickList));


    }
}
