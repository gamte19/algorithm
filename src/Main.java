import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*int[] sortedList = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(sortedList, 5));
        System.out.println(binarySearch.binarySearchRecursive(sortedList, 5, 0, sortedList.length));


        MergeSort mergesort = new MergeSort();
        mergesort.mergesort(sortedList);
        System.out.println(Arrays.toString(sortedList));
*/


 /*       int randomList[] = {15, 3, 9, 7, 19, 8, 1, 5};
        int ascOrdered[] = {1, 3, 5, 7, 8, 9, 15, 19};
        int descOrdered[] = {19, 15, 9, 8, 7, 5, 3, 1};
        int binaryList[] = {1, 0, 1, 0, 1, 0, 1, 0};
        int crazyRandomList[] = {10000, 3, 5345366, 234234, 5345366, 999, 1, 0};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSor(randomList);
        bubbleSort.bubbleSor(ascOrdered);
        bubbleSort.bubbleSor(descOrdered);
        bubbleSort.bubbleSor(binaryList);
        bubbleSort.bubbleSor(crazyRandomList);*/
        int randomList[] = {15, 3, 9, 19, 7, 8, 1, 5, 4};
        System.out.println(Arrays.toString(randomList));
        Mergesort mergesort = new Mergesort();
        mergesort.sort(randomList);
        System.out.println(Arrays.toString(randomList));


    }
}
