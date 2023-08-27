package jdbc29thjune;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectionjdbc {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/Test";
		String un="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(url, un, pwd);
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery("select * from Data");
		
		while(res.next())
		{
			String un1=res.getString(1);
			String pwd1=res.getString(2);
			System.out.println(un1+" "+pwd1);
		}
	}
}
