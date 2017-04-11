import java.util.Arrays;

public class BinarySearch {


    public int search(int[] sortedList, int number) {
        System.out.println("--- Binary Search --- O(log2 n)");
        System.out.println(Arrays.toString(sortedList));
        System.out.println("Index of " + number);

        int min = 0;
        int max = sortedList.length - 1;
        int mid;

        while (min <= max) {
            mid = (min + max) / 2;
            if (sortedList[mid] < number) {
                min = mid + 1;
            } else if (sortedList[mid] > number) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] sortedList, int number, int min, int max) {
        if (min > max) return -1;

        int mid = (min + max) / 2;
        if (sortedList[mid] < number) {
            return binarySearchRecursive(sortedList, number, mid + 1, max);
        } else if(sortedList[mid] > number) {
            return binarySearchRecursive(sortedList, number, min, mid-1);
        } else {
            return mid;
        }
    }

}
