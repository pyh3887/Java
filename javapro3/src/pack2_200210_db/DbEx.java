package pack2_200210_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbEx {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null; // select 결과를 받음

	public DbEx() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://192.168.0.87:3306/test", "root", "123"); // db와연결
//			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "123"); 
			pstmt = conn.prepareStatement("select * from aa");
			rs = pstmt.executeQuery();
			/*
			 * rs.next(); System.out.println(rs.getInt("bun") + " " + rs.getString("irum") +
			 * " " + rs.getString("juso"));
			 */

			while (rs.next()) {
				System.out.println(rs.getInt("bun") + " " + rs.getString("irum") + " " + rs.getString("juso"));
			}

		} catch (Exception e) {
			System.out.println("에러" + e);
		} finally { // 에러가 있어도

			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) {
		new DbEx();

	}

}
