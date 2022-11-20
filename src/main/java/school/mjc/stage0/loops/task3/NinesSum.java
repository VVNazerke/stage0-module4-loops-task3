package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String s ="";

        for (int i =1; i<=lengthOfLastNumber; i++){
            s += "9";
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
