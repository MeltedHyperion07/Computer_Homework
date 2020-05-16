import java.util.*;

public class Question2_NumberToWords {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        n = in.nextInt();
        if (n == 0) {
            System.out.print("Zero");
        } else {
            System.out.print(Word(n));
        }
    }

    static String Word(int n) {
        String words = "";
        String[] units = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tens = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};
        if (n < 0) {
            String nStr = "" + n;
            nStr = nStr.substring(1);
            return "minus " + Word(Integer.parseInt(nStr));
        }
        if ((n / 1000) > 0) {
            words += Word(n / 1000) + " thousand ";
            n %= 1000;
        }
        if ((n / 100) > 0) {
            words += Word(n / 100) + " hundred ";
            n %= 100;
        }
        if (n > 0) {
            if (n < 20) {
                words += units[n];
            } else {
                words += tens[n / 10];
                if ((n % 10) > 0) {
                    words += "-" + units[n % 10];
                }
            }
        }
        return words;
    }
}
