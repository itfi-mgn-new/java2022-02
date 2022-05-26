package lesson13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try(final Connection	c = DriverManager.getConnection(
									"jdbc:postgresql://localhost:5432/postgres"
									, "postgres"
									, "postgres")) {
			System.err.println("COnnected");

//			c.setAutoCommit(false);
//			c.commit();
//			c.rollback();
			
			try(final Statement	stmt = c.createStatement()) {
				
				stmt.executeUpdate("drop table x");
			} catch (SQLException exc) {
			}

			try(final Statement	stmt = c.createStatement()) {
				
				stmt.executeUpdate("create table x(y integer)");
			};
			
			try(final PreparedStatement	stmt = c.prepareStatement("insert into x(y) values (?)")) {
				stmt.setInt(1, 100);
				stmt.executeUpdate();
				stmt.setInt(1, 200);
				stmt.executeUpdate();
				stmt.setInt(1, 300);
				stmt.executeUpdate();
			};
			
			try(final Statement	stmt = c.createStatement()) {
					
					stmt.executeUpdate("create table x(y integer)");
				try(final ResultSet	rs = stmt.executeQuery("select * from x")) {
					final ResultSetMetaData	rsmd = rs.getMetaData();
					
					for (int index = 1; index <= rsmd.getColumnCount(); index++) {
						System.err.println("Col["+index+"]="+rsmd.getColumnName(index));
					}
					
					while (rs.next()) {
						System.err.println("Y="+rs.getString(1));
					}
				}
			}
		}
	}
}
