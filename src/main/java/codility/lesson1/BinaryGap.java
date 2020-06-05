package codility.lesson1;

import java.util.Arrays;

public class BinaryGap {

    public int solution(int N) {

        // 10進数から2進数へ変換する
        String binary = Integer.toBinaryString(N);
        System.out.println("decimal = " + N + ", binary = " + binary); // for Debug

        // String -> char[]
        char[] binaryArray = binary.toCharArray();
        System.out.println("binaryArray = " + Arrays.toString(binaryArray)); // for Debug

        int maxGap = 0;
        int currentGap = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == '0') {
                currentGap++;
            } else {
                if (maxGap < currentGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
            System.out.println("binaryArray[i] = " + binaryArray[i] + ", currentGap = " + currentGap + ", maxGap = " + maxGap); // for Debug
        }
        return maxGap;
    }
}
