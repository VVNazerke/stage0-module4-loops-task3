package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum, right =1, left = 0;
        System.out.println(left);

        for (int i = 1; i<lastFibonacci;i++){
            System.out.println(right);
            sum = left +right;
            left = right;
            right = sum;
        }
    }
}
