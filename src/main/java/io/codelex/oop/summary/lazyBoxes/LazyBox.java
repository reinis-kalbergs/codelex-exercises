package io.codelex.oop.summary.lazyBoxes;

import java.util.function.Function;
import java.util.function.Supplier;

public class LazyBox<T> {

    private T lazyObject;
    private final Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (lazyObject == null) {
            lazyObject = supplier.get();
        }
        return lazyObject;
    }

    public <U> LazyBox<U> map(Function<T, U> mapper) {
        return new LazyBox<U>(() -> mapper.apply(get()));
    }
}
