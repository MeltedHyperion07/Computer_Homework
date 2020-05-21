import java.util.*;

public class Question10_DateProgram {
    public static int JGREG= 15 + 31*(10+12*1582);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d=in.nextInt();
        int m=in.nextInt();
        int y=in.nextInt();
        int[] now = {y, m, d};
        int[] janFirst = {2010, 1, 1};
        double dayOfYear = toJulian(now) - toJulian(janFirst) + 1;
        System.out.println(Double.valueOf(dayOfYear).intValue());
    }
    public static double toJulian(int[] ymd) {
        int year=ymd[0];
        int month=ymd[1]; // jan=1, feb=2,...
        int day=ymd[2];
        int julianYear = year;
        if (year < 0) julianYear++;
        int julianMonth = month;
        if (month > 2) {
            julianMonth++;
        }
        else {
            julianYear--;
            julianMonth += 13;
        }

        double julian = (java.lang.Math.floor(365.25 * julianYear)
                + java.lang.Math.floor(30.6001*julianMonth) + day + 1720995.0);
        if (day + 31 * (month + 12 * year) >= JGREG) {
            // change over to Gregorian calendar
            int ja = (int)(0.01 * julianYear);
            julian += 2 - ja + (0.25 * ja);
        }
        return java.lang.Math.floor(julian);
    }
}

//Sample Input:8 6 2020
//Sample Output:3812
