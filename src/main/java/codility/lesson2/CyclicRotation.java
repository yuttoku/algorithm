package codility.lesson2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        // 空の配列はシフト開始前に返却
        if (A.length <= 0) {
            return A;
        }

        for (int i = 0; i < K; i++) {
            // 右端の要素を保存
            int tmp = A[A.length - 1];
            // 右方向にシフト
            for (int j = 0; j < A.length - 1; j++) {
                // String log = ""; // for Debug
                // log += Arrays.toString(A); // for Debug
                // 右方向に要素をシフト
                int indexL = (A.length - (2 + j));
                int indexR = (A.length - (1 + j));
                A[indexR] = A[indexL];
                // log += " -> " + Arrays.toString(A); // for Debug
                // log += " (A[" + indexL + "] -> A[" + indexR + "])"; // for Debug
                // System.out.println(log); // for Debug
            }
            // 左端に保存していた右端の要素を格納
            // String log = ""; // for Debug
            // log += Arrays.toString(A); // for Debug
            A[0] = tmp;
            // log += " -> " + Arrays.toString(A); // for Debug
            // log += " (A[0] <- " + tmp + ")"; // for Debug
            // System.out.println(log); // for Debug
        }
        return A;
    }
}
