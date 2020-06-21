package codility.lesson2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicRotationTest {

    CyclicRotation sut = new CyclicRotation();

    @Test
    void testNormal() {
        int[] expected = new int[]{5, 6, 7, 8, 9, 0, 1, 2, 3, 4};
        int[] actual = sut.solution(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 5);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testManyRotation() {
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = sut.solution(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 100000);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testEmptyArray() {
        int[] emptyArray = new int[]{};
        int[] actual = sut.solution(emptyArray, 5);
        assertEquals(Arrays.toString(emptyArray), Arrays.toString(actual));
    }

}