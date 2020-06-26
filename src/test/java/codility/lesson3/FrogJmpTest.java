package codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJmpTest {

    FrogJmp sut = new FrogJmp();

    @Test
    void testNormal() {
        int expected = 3;
        int actual = sut.solution(10, 85, 30);
        assertEquals(expected, actual);
    }

    @Test
    void testNoJump() {
        int expected = 0;
        int actual = sut.solution(1, 1, 30);
        assertEquals(expected, actual);
    }

    @Test
    void testBigJump() {
        int expected = 1;
        int actual = sut.solution(1, 2, 1000000000);
        assertEquals(expected, actual);
    }

    @Test
    void testTooManyJump() {
        int expected = 1000000000 - 1;
        int actual = sut.solution(1, 1000000000, 1);
        assertEquals(expected, actual);
    }
}