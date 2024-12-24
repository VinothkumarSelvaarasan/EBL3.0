package ComparableandComparator;
public class StudentPackage implements Comparable<StudentPackage> 
{
private String packageID;    
private String courseName;   
private double price;        
	    public StudentPackage(String packageID, String courseName, double price) {
	        this.packageID = packageID;
	        this.courseName = courseName;
	        this.price = price;
	    }
	    public String getPackageID() {
	        return packageID;
	    }
	    public String getCourseName() {
	        return courseName;
	    }
	    public double getPrice() {
	        return price;
	    }
	    @Override
	    public int compareTo(StudentPackage other) {
	        return this.courseName.compareTo(other.courseName);  
	    }
}