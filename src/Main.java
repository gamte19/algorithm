import data_structure.Stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sortedList = {15, 16, 19, 20, 25, 30, 34, 41, 52, 74, 100, 114};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Normal " + binarySearch.search(sortedList, 25));
        System.out.println("Recursive " + binarySearch.binarySearchRecursive(sortedList, 25, 0, sortedList.length));

        System.out.println("-----------------------------");
        int bubbleList[] = {15, 3, 9, 19,19,19,7, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(bubbleList));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSor(bubbleList);
        System.out.println(Arrays.toString(bubbleList));

        System.out.println("-----------------------------");
        int mergeList[] = {15, 3, 9, 19,19,19,7, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(mergeList));
        Mergesort mergesort = new Mergesort();
        mergesort.sort(mergeList);
        System.out.println(Arrays.toString(mergeList));

        System.out.println("-----------------------------");
        Quicksort quicksort = new Quicksort();
        int quickList[] = {15, 3, 9, 19,19,19,7, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(quickList));
        quicksort.sort(quickList);
        System.out.println(Arrays.toString(quickList));

        Stack<Integer> stack = new Stack();
        stack.put(3);
        stack.put(2);
        stack.put(4);
        stack.put(5);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
