package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		String url = "JDBC:mysql://localhost:3306/employees_database";
		int affectedRows=0;
		int id=0;
		try {
			// Establish Connection
			Connection connection = DriverManager.getConnection(url,"root","root@4747");
			
			//Create statement
			Statement statement=connection.createStatement();
			
			//Execute statement
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			System.out.println("New data is below \n\n:");
			displayTableData(resultSet);
			
			resultSet = statement.executeQuery("select max(id) id from employees_tbl");
			if(resultSet.next()) {
				id=resultSet.getInt("id");
				System.out.println("Highest id value is :"+id);
				id++;
			}
			String insertIdString="insert into employees_tbl values("+id+",'Sam Palakurla_"+id+"','IT',20000)";
			affectedRows=statement.executeUpdate(insertIdString);
			if(affectedRows!=0) {
				System.out.println("Number of rows affected is :"+affectedRows);
				System.out.println("New data is below:");
				resultSet = statement.executeQuery("select * from employees_tbl order by id asc");
				displayTableData(resultSet);
			}
		} catch (SQLException e) {
			System.out.println("Error while inserting data..");
		}
	}

	private static void displayTableData(ResultSet resultSet) {
		try {
			while(resultSet.next()) {
				System.out.println("Employee ID: "+resultSet.getString("id")+"  Employee name :"+resultSet.getString("name"));
			}
		} catch (SQLException e) {
			System.out.println("Error while Fetching data..");
		}
	}
}
