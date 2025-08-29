import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Input: Integer number
        int number = scanner.nextInt();

        // Calculate absolute value
        int absoluteValue = (number < 0) ? -number : number;

        // Output: Absolute value
        System.out.println(absoluteValue);

        scanner.close();
    }
}
