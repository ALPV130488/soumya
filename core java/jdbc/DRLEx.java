package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading Driver classes
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		(2)Creating Connetion
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","oracle","oracle");
//		(3)Create a Statement
		Statement stmt = conn.createStatement();
//		(4)Exceute the statement  DRL -->executeQuery()
		ResultSet result = stmt.executeQuery("select * from product");
		
		System.out.println("ProId"+"\t"+"PName"+"\t"+"pprice");
		System.out.println("---------------------------------");
		
		while(result.next()) {
			System.out.println(result.getInt("pid")+"\t"+result.getString("pname")+"\t"+result.getLong("pprice"));
		}
		
		
		
//		(5)Close the connections
		conn.close();
		
		
		
		
	}

}
