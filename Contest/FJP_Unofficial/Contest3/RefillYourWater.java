//This question is also available in Watering Plants

package Contest.FJP_Unofficial.Contest3;

import java.util.*;

public class RefillYourWater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        scn.close();
        System.out.println(wateringPlants(arr, cap));
    }

    public static int wateringPlants(int[] arr, int capacity) {
        int oCap = capacity;
        int cap = oCap;
        int idx = -1;
        int s = 0;

        while (idx < arr.length - 1) {

            if (arr[idx + 1] > oCap) {
                return Integer.MAX_VALUE;
            }

            if (arr[idx + 1] <= cap) {
                idx++;
                cap = cap - arr[idx];
                s++;
            } else {
                s = s + 2 * (idx + 1) + 1;
                idx++;
                cap = oCap - arr[idx];
            }
        }
        return s;
    }
}
