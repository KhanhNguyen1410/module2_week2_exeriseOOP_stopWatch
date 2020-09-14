package stopwacth;


import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
         stopWatch.start();
//        for (int i = 0; i < 10000; i++) {
//            System.out.println(i);
//        }
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100000 +1);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        int[] sortedArr= main.quickSort(array);
//        System.out.println(Arrays.toString(sortedArr));


        stopWatch.stop();
//        double c = stopWatch.getElapsedTime();

        System.out.println(stopWatch.getElapsedTime());
    }
//    public static int[] quickSort(int[] arr){
//        if(arr.length<2) return arr;
//        int pivot= arr.length-1;
//        int[] lower= new int[arr.length];
//        int[] upper= new int[arr.length];
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[pivot]<arr[i]){
//                upper[i]= arr[i];
//            }else{
//                lower[i]= arr[i];
//            }
//        }
//        int[] lowerS= main.quickSort(lower);
//        int[] upperS= main.quickSort(upper);
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(lowerS[i]==0) break;
//                arr[count]= lowerS[i];
//                count++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(upperS[i]==0) break;
//                arr[count]= upperS[i];
//                count++;
//
//        }
//        return arr;

}
