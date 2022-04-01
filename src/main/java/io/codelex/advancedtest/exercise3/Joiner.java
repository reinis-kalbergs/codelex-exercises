package io.codelex.advancedtest.exercise3;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... args) {
        return Arrays.stream(args).map(Objects::toString).collect(Collectors.joining(separator));
    }

}
