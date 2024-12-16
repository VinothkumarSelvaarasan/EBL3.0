package SortingPgm;

import java.util.regex.Pattern;

public class ValidationUtils {

    // Checks if the given string is a valid email address using regex and Java built-in functions.
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(emailRegex, email);
    }

    // Checks if the given string is a valid phone number using regex and Java built-in functions.
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // assuming number start with +91 and 10 digit number
        String phoneRegex = "^\\+91[0-9]{10}$";
        return Pattern.matches(phoneRegex, phoneNumber);
    }

    // Checks if the given string is a valid password using regex and Java built-in functions.
    public static boolean isValidPassword(String password) {
        // Assuming a simple password policy: At least 8 characters with at least one uppercase, one lowercase, one digit, and one special character
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    // Checks if the given string is a valid date using Java built-in functions.
    public static boolean isValidDate(String date) {
        // Assuming date format is yyyy-MM-dd
        try {
            java.time.LocalDate.parse(date);
            return true;
        } catch (java.time.format.DateTimeParseException e) {
            return false;
        }
    }

    // Checks if the given string is a valid number using Java built-in functions.
    public static boolean isValidNumber(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Checks if the given string is alphanumeric using Java built-in functions.
    public static boolean isValidAlphaNumeric(String text) {
        return text.matches("^[a-zA-Z0-9]*$");
    }
}
