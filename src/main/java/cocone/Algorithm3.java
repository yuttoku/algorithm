package cocone;

import java.util.Arrays;

public class Algorithm3 {

    public boolean solution(int a, int b, int c, int d, int e, int f) {

        // 現在のビーズ数
        int[] currentBeads = new int[3];
        currentBeads[0] = a;
        currentBeads[1] = b;
        currentBeads[2] = c;

        // 目標ビーズ数
        int[] targetBeads = new int[3];
        targetBeads[0] = d;
        targetBeads[1] = e;
        targetBeads[2] = f;

        // System.out.println("initialBeads: " + Arrays.toString(currentBeads)); // for Debug

        // 解決するまでコンポジットを繰り返す
        while (!isResolved(currentBeads, targetBeads)) {
            int compositedBeads = composit(currentBeads, targetBeads);
            if (compositedBeads <= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 不足しているビーズを他の色からコンポジットする
     *
     * @param currentBeads 現在のビーズ数
     * @param targetBeads  目標ビーズ数
     * @return コンポジットしたビーズ数
     */
    private static int composit(int[] currentBeads, int[] targetBeads) {

        int compositedBeads = 0;

        for (int i = 0; i < currentBeads.length; i++) {

            // 目標個数に到達していたら、次のビーズに移動
            if (targetBeads[i] - currentBeads[i] <= 0) {
                continue;
            }

            // 他の色のビーズの余りからコンポジット
            for (int j = 0; j < currentBeads.length; j++) {

                // 同じ色を除外
                if (i == j) {
                    continue;
                }

                // ビーズの余りからコンポジット可能な回数を取得
                int count = (currentBeads[j] - targetBeads[j]) / 2;

                // コンポジット不可なら次のビーズに移動
                if (count <= 0) {
                    continue;
                }

                // コンポジット
                currentBeads[i]++;
                currentBeads[j] -= 2;
                compositedBeads++;
                // System.out.println("currentBeads: " + Arrays.toString(currentBeads)); // for Debug
            }
        }
        return compositedBeads;
    }

    /**
     * 目標のビーズ数に到達しているか
     *
     * @param currentBeads 現在のビーズ数
     * @param targetBeads  目標ビーズ数
     * @return 目標のビーズ数に到達しているか
     */
    private static boolean isResolved(int[] currentBeads, int[] targetBeads) {
        return currentBeads[0] >= targetBeads[0]
                && currentBeads[1] >= targetBeads[1]
                && currentBeads[2] >= targetBeads[2];
    }
}
