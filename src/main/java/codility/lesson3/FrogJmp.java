package codility.lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        return Y - X <= 0 ? 0
                : (Y - X) % D == 0 ? (Y - X) / D
                : (Y - X) / D + 1;
    }
}
