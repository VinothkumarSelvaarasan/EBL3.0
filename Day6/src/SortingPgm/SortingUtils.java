package SortingPgm;

import java.util.Arrays;
import java.util.Comparator;

public class SortingUtils {

    // Sorts an array of Record objects based on a custom comparator using lambda expressions.
    public static void sort(Record[] records, Comparator<Record> comparator) {
        Arrays.sort(records, comparator);
    }

    // Sorts an array of strings alphabetically using lambda expressions.
    public static void sort(String[] names) {
        Arrays.sort(names);
    }

    // Sorts an array of double values in ascending order using lambda expressions.
    public static void sort(double[] amounts) {
        Arrays.sort(amounts);
    }
}
