import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        NumberStatistics stats = new NumberStatistics();
        NumberStatistics sumOfAll = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        Scanner sc = new Scanner(System.in);
        System.out.println("Type numbers:");

//        System.out.println("average: " + sumOfAll.average());

        try {
            while (sc.hasNext()) {
                int inp = sc.nextInt();
                if (inp == -1) {
                    System.out.println("sum: " + sumOfAll.sum());
                    System.out.println("sum of even: " + even.sum());
                    System.out.println("sum of odd: " + odd.sum());
                    break;
                } else if (inp % 2 == 0) {
                    even.addNumber(inp);
                    sumOfAll.addNumber(inp);
                } else if (!(inp % 2 == 0)) {
                    odd.addNumber(inp);
                    sumOfAll.addNumber(inp);
                }

            }
        } catch (Exception e) {
            System.err.println("Uh oh");
            e.printStackTrace();
        }


//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
    }
}