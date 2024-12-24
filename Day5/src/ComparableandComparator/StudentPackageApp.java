package ComparableandComparator;


public class StudentPackageApp {

    public static void main(String[] args) {
        // Create an instance of StudentPackageOperations to manage student packages
        StudentPackageOperation studentPackageOperations = new StudentPackageOperation();

        // Create some StudentPackage instances
        StudentPackage pkg1 = new StudentPackage("SP001", "Mathematics", 1500.0);
        StudentPackage pkg2 = new StudentPackage("SP002", "Science", 2000.0);
        StudentPackage pkg3 = new StudentPackage("SP003", "History", 1800.0);

        // Add the packages to the list in StudentPackageOperations
        studentPackageOperations.addPackageToList(pkg1);
        studentPackageOperations.addPackageToList(pkg2);
        studentPackageOperations.addPackageToList(pkg3);

        // Print the original list of packages
        System.out.println("Original packages:");
        for (StudentPackage studentPackage : studentPackageOperations.getPackages()) {
            System.out.println("PackageID: " + studentPackage.getPackageID() +
                    ", Course: " + studentPackage.getCourseName() +
                    ", Price: " + studentPackage.getPrice());
        }

        // Sort the packages by course name and display
        studentPackageOperations.sortPackagesByCourseName();
        System.out.println("\nPackages sorted by course name:");
        for (StudentPackage studentPackage : studentPackageOperations.getPackages()) {
            System.out.println("PackageID: " + studentPackage.getPackageID() +
                    ", Course: " + studentPackage.getCourseName() +
                    ", Price: " + studentPackage.getPrice());
        }

        // Sort the packages by price and display
        studentPackageOperations.sortPackagesByPrice();
        System.out.println("\nPackages sorted by price:");
        for (StudentPackage studentPackage : studentPackageOperations.getPackages()) {
            System.out.println("PackageID: " + studentPackage.getPackageID() +
                    ", Course: " + studentPackage.getCourseName() +
                    ", Price: " + studentPackage.getPrice());
        }
    }
}
