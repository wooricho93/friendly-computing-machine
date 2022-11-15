package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest_1 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "system";
	private static final String pwd = "1234";
	
	public static void main(String[] args) throws Exception {
		Connection conn;
		PreparedStatement pst;
		ResultSet rs;
		
		Class.forName(driver);
		System.out.println("드라이브 로드 성공");
		
		conn = DriverManager.getConnection(url, user, pwd);
		System.out.println(conn);
		
		// DB에 데이터 추가
		String insert = "insert into member values (seq_member.nextval, ?, ?, ?, ?)";
		pst = conn.prepareStatement(insert);
		
//		pst.setString(1, "양효진");
//		pst.setInt(2, 34);
//		pst.setInt(3, 190);
//		pst.setInt(4, 70);
//		
//		int num = pst.executeUpdate();
//		System.out.println("업로드 성공: " + num);
		
		// DB 데이터 조회
		String inquiry = "select * from member";
		pst = conn.prepareStatement(inquiry);
		
		rs = pst.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getInt(3) + "\t");
			System.out.print(rs.getInt(4) + "\t");
			System.out.print(rs.getInt(5));
			System.out.println();
		}
		
		// DB 데이터 삭제
		String delete = "delete from member where id = ?";
		pst = conn.prepareStatement(delete);
		
//		pst.setInt(1, 1002);
//		
//		int num2 = pst.executeUpdate();
//		System.out.println("delete: " + num2);
	}

}
