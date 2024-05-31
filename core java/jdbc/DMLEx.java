package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLEx {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading Driver classes
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		(2)Creating Connetion
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","oracle","oracle");
//		(3)Create a Statement
		Statement stmt = conn.createStatement();
//		(4)Exceute the statement  DML -->executeUpdate();addBatch()-->executeBatch()
//		stmt.executeUpdate("insert into product values(123,'apple',378468374)");

		stmt.addBatch("insert into product values(120,'samsung',37848374)");
		stmt.addBatch("insert into product values(121,'nokia',37846834)");
		stmt.addBatch("insert into product values(122,'GooglePixl',37468374)");
		stmt.addBatch("insert into product values(124,'Oneplus',37846374)");
		stmt.addBatch("insert into product values(125,'redmi',37846874)");
		
		stmt.executeBatch();
		
//		(5)Close the connections
		conn.close();
		
		
		System.out.println("Data is inserted.....");
		
	}

}
