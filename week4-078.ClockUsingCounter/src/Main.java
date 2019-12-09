import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);

        Scanner sc = new Scanner(System.in);

        System.out.println("seconds: ");
        int s = sc.nextInt();
        System.out.println("minutes: ");
        int m = sc.nextInt();
        System.out.println("hours: ");
        int h = sc.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            if ((minutes.getValue() == 0) && !(hours.getValue() == 0)) {
                hours.next();
            }
            // advance minutes
            // if minutes become zero, advance hours
            i++;
        }
    }
}
