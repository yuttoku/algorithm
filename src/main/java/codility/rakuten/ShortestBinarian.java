package codility.rakuten;

import java.util.ArrayList;
import java.util.List;

public class ShortestBinarian {

    public int solution(int[] A) {

        // 配列の各要素を2の指数とし、総和を算出する
        int sum = 0;
        for (int i : A) {
            sum += Math.pow(2, i);
        }

        // 算出した総和より最小の指数リストを取得してそのサイズを返却する
        return shortestBinarianList(sum).size();
    }


    private static List<Integer> shortestBinarianList(int num) {

        int tmp = num;

        // 返却用リストを初期化
        List<Integer> shortestBinarianList = new ArrayList<>();

        while (tmp > 0) {

            // 2を掛けられる回数を算出する
            int index = 0;
            int tmp2 = 1;
            // System.out.println("tmp - Math.pow(2, " + index + ")" + " = " + tmp + " - " + (int) Math.pow(2, index)); // for Debug
            while (tmp >= tmp2 * 2) {
                tmp2 = tmp2 * 2;
                index++;
                // System.out.println("tmp - Math.pow(2, " + index + ")" + " = " + tmp + " - " + (int) Math.pow(2, index)); // for Debug
            }

            // リストに指数を格納する
            tmp -= (int) Math.pow(2, index);
            shortestBinarianList.add(index);
            // System.out.println("num = " + tmp); // for Debug
            // System.out.println("shortestBinarianList: " + shortestBinarianList); // for Debug
        }
        return shortestBinarianList;
    }
}
