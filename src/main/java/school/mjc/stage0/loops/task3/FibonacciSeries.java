package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int  sum, right =1, left = 1;
        for (int i = 0; i<lastFibonacci;i++){
            sum = left +right;
            left = right;
            right = sum;
            System.out.println(right);
        }
    }
}
