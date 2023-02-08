package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("1.123123123123123123"));
    }
}
