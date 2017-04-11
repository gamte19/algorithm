public class Mergesort {
    private int[] numbers;
    private int[] helper;

    public void sort(int[] unorderedList){
        numbers = unorderedList;
        helper = new int[unorderedList.length];

        mergesort(0, unorderedList.length -1);
    }

    private void mergesort(int low, int high){
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high){
        for (int i = low; i <=high ; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
    }

}
