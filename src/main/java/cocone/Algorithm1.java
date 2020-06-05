package cocone;

public class Algorithm1 {

    public int solution(int param0) {

        // 各桁を配列に格納する
        char[] digits = String.valueOf(param0).toCharArray();

        // 配列の各要素の総和を算出する　
        int sum = 0;
        for (char digit : digits) {
            int num = Character.getNumericValue(digit);
            sum += num;
        }
        return sum;

    }
}
