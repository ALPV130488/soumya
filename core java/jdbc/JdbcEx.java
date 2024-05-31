package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading Driver classes
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		(2)Creating Connetion
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","oracle","oracle");
//		(3)Create a Statement
		Statement stmt = conn.createStatement();
//		(4)Exceute the statement  DDL -->execute()
		stmt.execute("create table Product(pid number(10),pname varchar2(10),pprice number(10))");
//		(5)Close the connections
		conn.close();
		
		
		System.out.println("Table is created.....");
		
	}

}
