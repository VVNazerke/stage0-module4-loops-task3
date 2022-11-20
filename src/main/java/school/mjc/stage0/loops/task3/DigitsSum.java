package school.mjc.stage0.loops.task3;
import java.lang.Math;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String s;
        int sum = 0;
        s = "" + Math.abs(t);
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(sum);

    }
}
