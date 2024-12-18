package simplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUDOperation {
	Scanner s=new Scanner(System.in);
	Register r=new Register();
	
	void add()
	{
		System.out.println("Enter the name");
		r.setName(s.next());
		System.out.println("Enter the Department");
		r.setDept(s.next());
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3308/register","root","");
PreparedStatement ps=c.prepareStatement("insert into registeration (name,dept) values(?,?)");
		ps.setString(1, r.getName());
		ps.setString(2, r.getDept());
		int i=ps.executeUpdate();
		if(i>0 )
		{
			System.out.println("Inserted Successfully");
		}
		else
		{
			System.out.println("Error in Insertion");
		}
		
		}
		catch(ClassNotFoundException cen)
		{
			System.out.println(cen);
		}
		catch(SQLException sqle)
		{
			System.out.println(sqle);
		}
		
		
	}
	public static void main(String[] args) {
		CRUDOperation co=new CRUDOperation();
		co.add();
	}

}
