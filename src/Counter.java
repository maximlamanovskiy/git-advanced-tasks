public class Counter {
    private static final int MAX_COUNT = 10;

    public void count() {
        for(int i = 0; i < MAX_COUNT; i++) {
            System.out.println(i + 1);
        }
    }
}
