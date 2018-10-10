package paragraf;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import paragraf.SimpanSementara;;

/**
 * Servlet implementation class TampilTabel2
 */
@WebServlet("/TampilTabel2")
public class TampilTabel2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TampilTabel2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		KoneksiDatabase db = new KoneksiDatabase();
		Connection conn = db.getConnection();
		
		try {
			statement = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql ="SELECT NO,input,output,DATE_FORMAT(tanggal, '%d %M %Y'), parameter FROM output2";

		try {
			resultSet = statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<SimpanSementara> empList = new ArrayList<SimpanSementara>();
		
		
		try {
			while(resultSet.next()){
				SimpanSementara emp1 = new SimpanSementara();
				
				emp1.setNo(resultSet.getString("no"));
				emp1.setInput(resultSet.getString("input"));
				emp1.setOutput(resultSet.getString("output"));
				emp1.setTanggal(resultSet.getString("DATE_FORMAT(tanggal, '%d %M %Y')"));
				emp1.setParameter(resultSet.getString("parameter"));
				empList.add(emp1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("empList", empList);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/TampilTabel2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
