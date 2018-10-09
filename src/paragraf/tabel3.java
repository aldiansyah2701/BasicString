package paragraf;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tabel3 {
	public static Statement statement1 = null;
	public static ResultSet resultSet1 = null;
	public static int x=0;
	public static String[] databas1 = new String[100];
	
	public static String getData(int baru) throws SQLException{
		Output db = new Output();
		Connection conn = db.getConnection();
		
		statement1=conn.createStatement();
		String sql ="SELECT NO,input,output,DATE_FORMAT(tanggal, '%d %M %Y'), parameter FROM output2";

		resultSet1 = statement1.executeQuery(sql);
		x=1;
		while(resultSet1.next()){
			
			System.out.println(resultSet1.getString("input"));
			databas1[x] =resultSet1.getString("no");
			x++;
			databas1[x] =resultSet1.getString("input");
			x++;
			databas1[x] =resultSet1.getString("output");
			x++;
			databas1[x] =resultSet1.getString("DATE_FORMAT(tanggal, '%d %M %Y')");
			x++;
			databas1[x] =resultSet1.getString("parameter");
			x++;
			
		}
	
		return databas1[baru];
	}
	
	public static int count(){
		
		return x;
	}
	
	public static String databas2(int index){
		
		return databas1[index];
	}
	
	

}
