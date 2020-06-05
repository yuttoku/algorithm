package cocone;

import java.util.Arrays;

public class Algorithm5 {

    public int solution(String s) {

        char[] blocks = s.toCharArray();
        int[] flags = new int[s.length()];

        System.out.println(Arrays.toString(blocks) + " : " + Arrays.toString(flags) + " : " + text(blocks, flags)); // for Debug

        // 不能になるまでブロックの連結操作を行う
        while (true) {
            int jointedCount = joinBlock(blocks, flags);
            if (jointedCount == 0) {
                break;
            }
        }

        // 全ブロック連結できたか?
        return Arrays.stream(flags).sum() == flags.length + 1 ? 1 : 0;
    }

    /**
     * ブロックの連結を行う
     *
     * @param blocks ブロック
     * @param flags  ブロックの連結状態
     * @return 連結したブロック数
     */
    private static int joinBlock(char[] blocks, int[] flags) {

        int jointedCount = 0;

        for (int i = 0; i < blocks.length; i++) {
            // 連結済みは無視
            if (flags[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < blocks.length; j++) {
                // 連結済みは無視
                if (flags[j] == 1) {
                    continue;
                }
                // 隣接している同一ブロックは連結、それ以外は次の探査へ移行する
                if (blocks[i] == blocks[j]) {
                    flags[i] = 1;
                    flags[j] = 1;
                    jointedCount++;
                    System.out.println(Arrays.toString(blocks) + " : " + Arrays.toString(flags) + " : " + text(blocks, flags)); // for Debug
                    break;
                } else {
                    break;
                }
            }
        }
        // 連結したか?
        return jointedCount;
    }

    private static String text(char[] blocks, int[] flags) {
        String text = "";
        for (int i = 0; i < flags.length; i ++) {
            if (flags[i] == 0) {
                text += String.valueOf(blocks[i]);
            }
        }
        return text;
    }
}
