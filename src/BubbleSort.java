/**
 * Created by Mate on 2017. 04. 05..
 */
public class BubbleSort {


    public int[] bubbleSor(int[] crunchifyArr) {
        int temp;
        for (int i = 0; i < crunchifyArr.length - 1; i++) {
            for (int j = 1; j < crunchifyArr.length - i; j++) {
                if (crunchifyArr[j - 1] > crunchifyArr[j]) {
                    temp = crunchifyArr[j - 1];
                    crunchifyArr[j - 1] = crunchifyArr[j];
                    crunchifyArr[j] = temp;
                }
            }
        }
        System.out.println("----------------------");
        return crunchifyArr;
    }



}
