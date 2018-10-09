package paragraf;
import java.sql.Connection;
import paragraf.Output;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.io.*;

public class tabel2  {
	public static Statement statement = null;
	public static ResultSet resultSet = null;
	public static int baca;
	public static int x=0;
	public static String[] databas = new String[100];
	 
	 
	public static String setData(int baru) throws SQLException{
		Output db = new Output();
		Connection conn = db.getConnection();
		
		statement=conn.createStatement();
		String sql ="SELECT NO,input,output,DATE_FORMAT(tanggal, '%d %M %Y') FROM output2";

		resultSet = statement.executeQuery(sql);
		x=1;
		while(resultSet.next()){
			
			System.out.println(resultSet.getString("input"));
			databas[x] =resultSet.getString("no");
			x++;
			databas[x] =resultSet.getString("input");
			x++;
			databas[x] =resultSet.getString("output");
			x++;
			databas[x] =resultSet.getString("DATE_FORMAT(tanggal, '%d %M %Y')");
			x++;
			
		}
		
		baca=baru;
		return databas[baru];
	}
	
	public static int count(){
		
		return x;
	}
	
	public static String databas1(int index){
		
		return databas[index];
	}
	                

	
	
}
