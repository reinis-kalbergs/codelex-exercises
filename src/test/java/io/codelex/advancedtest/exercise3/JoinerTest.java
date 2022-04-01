package io.codelex.advancedtest.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void shouldJoinIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String expectedResult = "1-2-3-4";

        String actualResult = joiner.join(1, 2, 3, 4);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldJoinStrings() {
        Joiner<String> joiner = new Joiner<>(" ");
        String expectedResult = "a b c";

        String actualResult = joiner.join("a", "b", "c");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
