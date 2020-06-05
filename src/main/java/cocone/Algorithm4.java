package cocone;

import java.util.Arrays;

public class Algorithm4 {
    public String solution(String[] strs) {

        // 0番目の文字列からprefix候補を全パターン取得する
        String[] prefixs = new String[strs[0].length()];
        for (int i = 0; i < prefixs.length; i ++){
            prefixs[i] = strs[0].substring(0, i + 1);
        }

        // System.out.println("prefixs:"); // for Debug
        // for (int i = 0; i < prefixs.length; i ++) System.out.println("[" + i + "]: " + prefixs[i]); // for Debug

        // prefix候補と残り文字列をマッチング
        // System.out.println("--- START ---"); // for Debug
        int maxIndex = -1;
        for (int i = 0; i < prefixs.length; i ++) {
            boolean hasPrefix = true;
            for (int j = 1; j < strs.length; j ++) {
                // String logMessage = "prefixs[" + i + "] vs strs[" + j + "] = \"" + prefixs[i] + "\" vs " + strs[j] + "\""; // for Debug
                if (strs[j].indexOf(prefixs[i]) != 0) {
                    // logMessage += " BREAK"; // for Debug
                    // System.out.println(logMessage); // for Debug
                    hasPrefix = false;
                    break;
                }
                // logMessage += " CONTAIN!"; // for Debug
                // System.out.println(logMessage); // for Debug
            }
            if (hasPrefix && maxIndex < i) {
                // System.out.println("maxIndex is updated by " + i); // for Debug
                maxIndex = i;
            } else {
                break;
            }
        }
        // System.out.println("--- END ---"); // for Debug
        return maxIndex >= 0 ? prefixs[maxIndex] : "";
    }
}
