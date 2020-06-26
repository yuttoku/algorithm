package codility.lesson3;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        return Y - X <= 0 ? 0
                : (Y - X) % D == 0 ? (Y - X) / D
                : (Y - X) / D + 1;
    }
}
