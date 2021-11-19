package Functions_and_Arrays.Codes;
import java.util.*;

public class DigitFrequency {

    public static int digitFreq(int n, int d) {

        int freq = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == d)
                freq++;
            n /= 10;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        scn.close();
        System.out.println(digitFreq(n, d));
    }
}