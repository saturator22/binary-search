package com.codecool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    int[] numbers;

    @BeforeEach
    void setup() {
        numbers = new int[] {1, 3, 4, 5, 12, 45, 234, 535, 543};
    }

    @Test
    void testFail() {
        assertThrows(IllegalArgumentException.class, () -> BinarySearch.binarySearch(numbers, 2));
    }

    @Test
    void testSearch() {
        assertEquals(true, BinarySearch.binarySearch(numbers, 234));
    }
}
