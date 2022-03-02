
import java.sql.*;

public class JDBC_demo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// TODO Auto-generated method stub
       Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ashu","root","ashu8055");
		Statement st = con.createStatement();
		String query1 = "insert into student values(4,'sham',20)";
		String query2 = "Delet from student where ID_2";
		st.executeUpdate(query1);
		System.out.println("row inserted successfully");
		st.close();
		con.close();
		
	}

}
