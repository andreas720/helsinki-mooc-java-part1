public class Main {



    public static void main(String[] args) {
        // write testcode here
        Counter counter = new Counter(300, false);

        int x = counter.value();

        System.out.println(counter.value());
        counter.decrease(89);
        System.out.println(counter.value());
        counter.decrease(2895);
        System.out.println(counter.value());
    }
}
