package stopwacth;


public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
         stopWatch.start();

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
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }


}
