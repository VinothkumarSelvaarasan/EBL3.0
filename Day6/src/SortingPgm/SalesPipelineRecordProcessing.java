package SortingPgm;

import java.util.Comparator;

public class SalesPipelineRecordProcessing {
    public static void main(String[] args) {
        System.out.println("========== Sales Pipeline Record Processing utility ============");

        Record[] records = {
                new Record("Pending", 1000.0),
                new Record("Approved", 2500.0),
                new Record("Rejected", 1500.0),
                new Record("Pending", 1800.0)
        };

        String[] names = {"John", "Alice", "Bob", "David"};

        String[] data = {"apple", "banana", "12345", "abc123"};

        // Sorting Functions
        System.out.println("Sorting records by amount:");
        SortingUtils.sort(records, Comparator.comparing(Record::getAmount));
        for (Record record : records) {
            System.out.println(record.getAmount());
        }

        System.out.println("Sorting names:");
        SortingUtils.sort(names);
        for (String name : names) {
            System.out.println(name);
        }

        double[] amounts = {5.6, 2.3, 8.9, 3.1};
        System.out.println("Sorting amounts:");
        SortingUtils.sort(amounts);
        for (double amount : amounts) {
            System.out.println(amount);
        }

        // Filtering Functions
        System.out.println("Filtering records by status:");
        Record[] filteredRecords = FilteringUtils.filterByStatus(records, record -> record.getStatus().equals("Pending"));
        for (Record record : filteredRecords) {
            System.out.println(record.getStatus() + ": " + record.getAmount());
        }

        System.out.println("Filtering records by amount:");
        filteredRecords = FilteringUtils.filterByAmount(records, amount -> amount > 2000.0);
        for (Record record : filteredRecords) {
            System.out.println(record.getStatus() + ": " + record.getAmount());
        }

        System.out.println("Filtering strings by pattern:");
        String[] filteredData = FilteringUtils.filterByPattern(data, "\\d+");
        for (String item : filteredData) {
            System.out.println(item);
        }

        // Validation Functions
        System.out.println("Validating email:");
        System.out.println("john@example.com: " + ValidationUtils.isValidEmail("john@example.com"));
        System.out.println("invalid.email: " + ValidationUtils.isValidEmail("invalid.email"));

        System.out.println("Validating phone number:");
        System.out.println("1234567890: " + ValidationUtils.isValidPhoneNumber("1234567890"));
        System.out.println("12345: " + ValidationUtils.isValidPhoneNumber("12345"));

        System.out.println("Validating password:");
        System.out.println("Abcd@1234: " + ValidationUtils.isValidPassword("Abcd@1234"));
        System.out.println("password: " + ValidationUtils.isValidPassword("password"));

        System.out.println("Validating date:");
        System.out.println("2024-04-30: " + ValidationUtils.isValidDate("2024-04-30"));
        System.out.println("2024/04/30: " + ValidationUtils.isValidDate("2024/04/30"));

        System.out.println("Validating number:");
        System.out.println("123.45: " + ValidationUtils.isValidNumber("123.45"));
        System.out.println("abc: " + ValidationUtils.isValidNumber("abc"));

        System.out.println("Validating alphanumeric:");
        System.out.println("abc123: " + ValidationUtils.isValidAlphaNumeric("abc123"));
        System.out.println("abc#123: " + ValidationUtils.isValidAlphaNumeric("abc#123"));

        System.out.println("============== End of Sales Pipeline Record Processing utility ==============");
    }
}