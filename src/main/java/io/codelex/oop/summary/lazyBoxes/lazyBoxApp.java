package io.codelex.oop.summary.lazyBoxes;

public class lazyBoxApp {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(lazyBoxApp::doLargeCalculations);
        LazyBox<String> textBox = box.map(Object::toString);
        LazyBox<String> upperTextBox = textBox.map(String::toUpperCase);

        String result = upperTextBox.get();
        System.out.println(result);
    }

    public static Integer doLargeCalculations() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return 153;
    }

    public static <R> void printOutBoxContents(LazyBox<R> lazyBox) {
        System.out.println(lazyBox.get());
    }

}
