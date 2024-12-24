package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class StudentPackageOperation {
	
    private List<StudentPackage> studentPackages;
    
    public StudentPackageOperation() {
        this.studentPackages = new ArrayList<>();
    }
    public void addPackageToList(StudentPackage studentPackage) {
        this.studentPackages.add(studentPackage);
    }
    public List<StudentPackage> getPackages() {
        return this.studentPackages;
    }
    public void sortPackagesByCourseName() {
        Collections.sort(studentPackages); 
    }
    public void sortPackagesByPrice() {
    	studentPackages.sort(Comparator.comparingDouble(StudentPackage::getPrice));
    }
}








