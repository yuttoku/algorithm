package codility.lesson1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {


    BinaryGap sut = new BinaryGap();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @ValueSource(ints = {
            0 // 0
            , 1  // 1
            , 2  // 10
            , 3  // 11
            , 4  // 100
            , 6  // 110
            , 7  // 111
            , 8  // 1000
            , 12 // 1100
            , 14 // 1110
            , 15 // 1111
            , 16 // 10000
    })
    void gapLengthZero(int n) {
        assertEquals(0, sut.solution(n));
    }

    @ValueSource(ints = {
            5  // 101
            , 10 // 1010
            , 11 // 1011
            , 13 // 1101
            , 14 // 1110
            , 20  // 10100
    })
    void gapLengthOne(int n) {
        assertEquals(1, sut.solution(n));
    }

    @ValueSource(ints = {
            9  // 1001
            , 18 // 10010
            , 19 // 10011
    })
    void gapLengthTwo(int n) {
        assertEquals(2, sut.solution(n));
    }}