package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBTest_2 {
	
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "system";
	private static final String pwd = "1234";
	
	public static void main(String[] args) throws Exception {
		List<Member> list = new ArrayList<>();
		
		// 데이터를 하나씩 입력해야 함. 그렇지 않을 시 맨 마지막 데이터만 추가됨
		list.add(new Member("김연경", 36, 192, 73));
		list.add(new Member("김희진", 32, 185, 75));
		list.add(new Member("양효진", 34, 190, 70));
		
		Connection conn;
		PreparedStatement pst;
		ResultSet rs;
		
		Class.forName(driver);
		System.out.println("드라이브 로드 성공");
		
		conn = DriverManager.getConnection(url, user, pwd);
		System.out.println(conn);
		
		String insert = "insert into member values (seq_member.nextval, ?, ?, ?, ?)";
		pst = conn.prepareStatement(insert);
		
		for (Member m : list) {
			pst.setString(1, m.getName());
			pst.setInt(2, m.getAge());
			pst.setInt(3, m.getHeight());
			pst.setInt(4, m.getWeight());
		}
		
		int num = pst.executeUpdate();
		System.out.println("업로드 성공: " + num);
		
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
		
	}

}
