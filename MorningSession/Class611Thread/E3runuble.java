package scr.MorningSession.Class611Thread;
//
public class E3runuble {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SummNumbers summNumbers= new SummNumbers(num);

        Thread sumThread = new Thread(summNumbers);
        sumThread.start();
    }
}
class SummNumbers implements Runnable {
    private int[] nums;
    private int sum;

    public SummNumbers(int[] nums) {
        this.nums = nums;
    }
    @Override
    public void run() {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
    public int getSum(){
        return sum;
    }
}