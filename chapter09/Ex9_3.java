import java.util.Date;

public class Ex9_3 {
    public static void main(String[] args) {
        // Array of elapsed times
        long[] times = {
            10000L,
            100000L,
            1000000L,
            10000000L,
            100000000L,
            1000000000L,
            10000000000L,
            100000000000L
        };

        // Create a Date object
        Date date = new Date();

        System.out.println("|   Elapsed Time (ms)   |             Date and Time             |");
        System.out.println("------------------------------------------------------------------");

        // Loop through the times and set the elapsed time
        for (long time : times) {
            date.setTime(time);
            System.out.printf("| %20d | %s |\n", time, date.toString());
        }
    }
}


/* Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively. */