/**
 * Created by Mate on 2017. 04. 05..
 */
public class BubbleSort {


  public int[] bubbleSor(int[] values) {
      int temp;
      for (int i = 0; i < values.length-1 ; i++) {
          for (int j = 1; j < values.length-i; j++) {
              if (values[j-1] > values[j]){
                  temp = values[j-1];
                  values[j-1] = values[j];
                  values[j] = temp;
              }
          }
      }

      return values;
  }



}
