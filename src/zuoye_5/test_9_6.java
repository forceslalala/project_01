package zuoye_5;

import java.util.Arrays;
import java.util.Random;

public class test_9_6 {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random num = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt(100000);
        }
        StopWatch time = new StopWatch();
        Arrays.sort(arr);
        time.stop();
        System.out.println("执行了" + time.getElapsedTime() + "毫秒");
    }
}

class StopWatch {
    private long startTime, endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    void start(){
        this.startTime = System.currentTimeMillis();
    }

    void stop(){
        this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
