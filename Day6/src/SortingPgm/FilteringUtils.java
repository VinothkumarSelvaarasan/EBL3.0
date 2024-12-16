package SortingPgm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringUtils {

    // Filters an array of Record objects based on the provided status predicate.
    public static Record[] filterByStatus(Record[] records, Predicate<Record> predicate) {
        List<Record> filteredRecords = new ArrayList<>();
        for (Record record : records) {
            if (predicate.test(record)) {
                filteredRecords.add(record);
            }
        }
        return filteredRecords.toArray(new Record[0]);
    }

    // Filters an array of Record objects based on the provided amount predicate.
    public static Record[] filterByAmount(Record[] records, Predicate<Double> predicate) {
        List<Record> filteredRecords = new ArrayList<>();
        for (Record record : records) {
            if (predicate.test(record.getAmount())) {
                filteredRecords.add(record);
            }
        }
        return filteredRecords.toArray(new Record[0]);
    }

    // Filters an array of strings based on the provided regex pattern.
    public static String[] filterByPattern(String[] data, String pattern) {
        List<String> filteredData = new ArrayList<>();
        for (String item : data) {
            if (item.matches(pattern)) {
                filteredData.add(item);
            }
        }
        return filteredData.toArray(new String[0]);
    }
}
