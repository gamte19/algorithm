public class Quicksort {
   int[] orderedList;

   public void sort(int[] unorderedList) {
       orderedList = unorderedList;
       quicksort(0, unorderedList.length-1);
   }

   private void quicksort(int low, int high){
       int i = low;
       int j = high;
       int pivot = orderedList[(low + high) / 2];

       while (i <= j) {
           while (orderedList[i] < pivot) {
               i++;
           }
           while (orderedList[j] > pivot) {
               j--;
           }

           if (i<=j){
               swapp(i, j);
               i++;
               j--;
           }
       }
       if (low < j) quicksort(low, j);
       if (i < high) quicksort(i, high);

   }

   private void swapp(int i, int j) {
       int temp = orderedList[i];
       orderedList[i] = orderedList[j];
       orderedList[j] = temp;
   }

}
